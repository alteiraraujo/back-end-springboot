package com.example.springboot.dtos;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

import java.math.BigDecimal;

public record ProdutoRecordDto(@NotBlank String cod_produto,
                               @NotBlank String desc_produto,
                               int id_categoria,
                               int id_fornecedor,
                               String status,
                               @NotNull int qtd_produto,
                               @NotNull BigDecimal valor_compra,
                               @NotNull BigDecimal valor_venda) {

}
