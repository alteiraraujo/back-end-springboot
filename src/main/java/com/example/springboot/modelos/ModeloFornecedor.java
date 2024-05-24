package com.example.springboot.modelos;
import jakarta.persistence.*;

import java.io.Serializable;
import java.util.UUID;

@Entity
@Table(name="tbl_fornecedores")
public class ModeloFornecedor implements Serializable {
    private static final long serialVersionUID=1L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id_fornecedor;
    private String nome_fornecedor;
    private String endereco_fornecedor;
    private String cnpj_fornecedor;
    private String ie_fonecedor;
    private String cidade_fornecedor;

    public UUID getId_fornecedor() {
        return id_fornecedor;
    }

    public void setId_fornecedor(UUID id_fornecedor) {
        this.id_fornecedor = id_fornecedor;
    }

    public String getNome_fornecedor() {
        return nome_fornecedor;
    }

    public void setNome_fornecedor(String nome_fornecedor) {
        this.nome_fornecedor = nome_fornecedor;
    }

    public String getEndereco_fornecedor() {
        return endereco_fornecedor;
    }

    public void setEndereco_fornecedor(String endereco_fornecedor) {
        this.endereco_fornecedor = endereco_fornecedor;
    }

    public String getCnpj_fornecedor() {
        return cnpj_fornecedor;
    }

    public void setCnpj_fornecedor(String cnpj_fornecedor) {
        this.cnpj_fornecedor = cnpj_fornecedor;
    }

    public String getIe_fonecedor() {
        return ie_fonecedor;
    }

    public void setIe_fonecedor(String ie_fonecedor) {
        this.ie_fonecedor = ie_fonecedor;
    }

    public String getCidade_fornecedor() {
        return cidade_fornecedor;
    }

    public void setCidade_fornecedor(String cidade_fornecedor) {
        this.cidade_fornecedor = cidade_fornecedor;
    }

    public String getEstado_fornecedor() {
        return estado_fornecedor;
    }

    public void setEstado_fornecedor(String estado_fornecedor) {
        this.estado_fornecedor = estado_fornecedor;
    }

    public String getTelefone_fornecedor() {
        return telefone_fornecedor;
    }

    public void setTelefone_fornecedor(String telefone_fornecedor) {
        this.telefone_fornecedor = telefone_fornecedor;
    }

    private String estado_fornecedor;
    private String telefone_fornecedor;

}
