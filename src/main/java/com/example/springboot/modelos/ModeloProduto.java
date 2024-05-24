package com.example.springboot.modelos;
import jakarta.persistence.*;
import org.springframework.boot.Banner;
import org.springframework.hateoas.RepresentationModel;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.UUID;

@Entity
@Table(name="tbl_produtos")
public class ModeloProduto extends RepresentationModel<ModeloProduto> implements Serializable {
    private static final long serialVersionUID=1L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id_produto;
    private String cod_produto;
    private String desc_produto;
    private int qtd_produto;
    private BigDecimal valor_compra;
    private BigDecimal valor_venda;
    private int id_categoria;
    private int id_fornecedor;

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    private String status;

    public UUID getId_produto() {
        return id_produto;
    }

    public void setId_produto(UUID id_produto) {
        this.id_produto = id_produto;
    }

    public String getCod_produto() {
        return cod_produto;
    }

    public void setCod_produto(String cod_produto) {
        this.cod_produto = cod_produto;
    }

    public String getDesc_produto() {
        return desc_produto;
    }

    public void setDesc_produto(String desc_produto) {
        this.desc_produto = desc_produto;
    }

    public int getQtd_produto() {
        return qtd_produto;
    }

    public void setQtd_produto(int qtd_produto) {
        this.qtd_produto = qtd_produto;
    }

    public BigDecimal getValor_compra() {
        return valor_compra;
    }

    public void setValor_compra(BigDecimal valor_compra) {
        this.valor_compra = valor_compra;
    }

    public BigDecimal getValor_venda() {
        return valor_venda;
    }

    public void setValor_venda(BigDecimal valor_venda) {
        this.valor_venda = valor_venda;
    }

    public int getId_categoria() {
        return id_categoria;
    }

    public void setId_categoria(int id_categoria) {
        this.id_categoria = id_categoria;
    }

    public int getId_fornecedor() {
        return id_fornecedor;
    }

    public void setId_fornecedor(int id_fornecedor) {
        this.id_fornecedor = id_fornecedor;
    }
}
