package com.example.springboot.modelos;
import jakarta.persistence.*;

import java.io.Serializable;
import java.util.UUID;

@Entity
@Table(name="tbl_colaboradores")
public class ModeloColaborador implements Serializable {
    private static final long serialVersionUID=1L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id_colaborador;
    private String nome_colaborador;
    private String endereco_colaborador;
    private String cpf_colaborador;
    private String cidade_colaborador;
    private String estado_colaborador;
    private String telefone_colaborador;
    private String cargo_colaborador;

    public UUID getId_colaborador() {
        return id_colaborador;
    }

    public void setId_colaborador(UUID id_colaborador) {
        this.id_colaborador = id_colaborador;
    }

    public String getNome_colaborador() {
        return nome_colaborador;
    }

    public void setNome_colaborador(String nome_colaborador) {
        this.nome_colaborador = nome_colaborador;
    }

    public String getEndereco_colaborador() {
        return endereco_colaborador;
    }

    public void setEndereco_colaborador(String endereco_colaborador) {
        this.endereco_colaborador = endereco_colaborador;
    }

    public String getCpf_colaborador() {
        return cpf_colaborador;
    }

    public void setCpf_colaborador(String cpf_colaborador) {
        this.cpf_colaborador = cpf_colaborador;
    }

    public String getCidade_colaborador() {
        return cidade_colaborador;
    }

    public void setCidade_colaborador(String cidade_colaborador) {
        this.cidade_colaborador = cidade_colaborador;
    }

    public String getEstado_colaborador() {
        return estado_colaborador;
    }

    public void setEstado_colaborador(String estado_colaborador) {
        this.estado_colaborador = estado_colaborador;
    }

    public String getTelefone_colaborador() {
        return telefone_colaborador;
    }

    public void setTelefone_colaborador(String telefone_colaborador) {
        this.telefone_colaborador = telefone_colaborador;
    }

    public String getCargo_colaborador() {
        return cargo_colaborador;
    }

    public void setCargo_colaborador(String cargo_colaborador) {
        this.cargo_colaborador = cargo_colaborador;
    }

    public String getEmail_colaborador() {
        return email_colaborador;
    }

    public void setEmail_colaborador(String email_colaborador) {
        this.email_colaborador = email_colaborador;
    }

    private String email_colaborador;


}
