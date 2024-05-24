package com.example.springboot.controllers;

import com.example.springboot.modelos.ModeloProduto;
import com.example.springboot.dtos.ProdutoRecordDto;
import com.example.springboot.repositories.RepositorioProduto;
import jakarta.validation.Valid;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

import static org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.linkTo;
import static org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.methodOn;

@RestController
public class ControleProduto {

    @Autowired
    RepositorioProduto repositorioProduto;

    @PostMapping("/produtos")
    public ResponseEntity<ModeloProduto> saveProduct(@RequestBody @Valid ProdutoRecordDto produtoRecordDto) {
        var productModel = new ModeloProduto();
        BeanUtils.copyProperties(produtoRecordDto, productModel);
        return ResponseEntity.status(HttpStatus.CREATED).body(repositorioProduto.save(productModel));
    }
    @GetMapping("/produtos")
    public ResponseEntity<List<ModeloProduto>>getAllProducts(){
        List<ModeloProduto> productList = repositorioProduto.findAll();
        if(!productList.isEmpty()){
            for(ModeloProduto product : productList){
                UUID id = product.getId_produto();
                product.add(linkTo(methodOn(ControleProduto.class).getOneProduct(id)).withSelfRel());
            }
        }
        return ResponseEntity.status(HttpStatus.OK).body(productList);
    }
    @GetMapping("/produtos/{id}")
    public ResponseEntity<Object>getOneProduct(@PathVariable(value="id") UUID id){
        Optional<ModeloProduto> productO = repositorioProduto.findById(id);
        if(productO.isEmpty()){
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Product not found.");
        }
        productO.get().add(linkTo(methodOn(ControleProduto.class).getAllProducts()).withRel("Products List"));
        return ResponseEntity.status(HttpStatus.OK).body(productO.get());
    }
   @PutMapping("/produtos/{id}")
    public ResponseEntity<Object> updateProduct(@PathVariable(value="id") UUID id,
                                                @RequestBody @Valid ProdutoRecordDto produtoRecordDto){
        Optional<ModeloProduto> product0 = repositorioProduto.findById(id);
        if(product0.isEmpty()){
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("product not found.");
        }
        var productModel = product0.get();
        BeanUtils.copyProperties(produtoRecordDto, productModel);
       return ResponseEntity.status(HttpStatus.OK).body(repositorioProduto.save(productModel));
   }
   @DeleteMapping("/produtos/{id}")
    public ResponseEntity<Object> deleteProduct(@PathVariable(value = "id")UUID id){
        Optional<ModeloProduto> product0 = repositorioProduto.findById(id);
        if(product0.isEmpty()){
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("product not found.");
        }
        repositorioProduto.delete(product0.get());
        return ResponseEntity.status(HttpStatus.OK).body("Product deleted sucessfully.");
   }

}
