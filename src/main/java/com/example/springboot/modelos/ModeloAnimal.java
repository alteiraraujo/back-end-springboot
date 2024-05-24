package com.example.springboot.modelos;
import jakarta.persistence.*;

import java.io.Serializable;
import java.util.UUID;

@Entity
@Table(name="tbl_animais")
public class ModeloAnimal implements Serializable {
    private static final long serialVersionUID=1L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id_animal;
    private String raca_animal;
    private String especie_animal;
    private int idade_animal;
    private String nome_animal;
    private int id_cliente;

    public UUID getId_animal() {
        return id_animal;
    }

    public void setId_animal(UUID id_animal) {
        this.id_animal = id_animal;
    }

    public String getRaca_animal() {
        return raca_animal;
    }

    public void setRaca_animal(String raca_animal) {
        this.raca_animal = raca_animal;
    }

    public String getEspecie_animal() {
        return especie_animal;
    }

    public void setEspecie_animal(String especie_animal) {
        this.especie_animal = especie_animal;
    }

    public int getIdade_animal() {
        return idade_animal;
    }

    public void setIdade_animal(int idade_animal) {
        this.idade_animal = idade_animal;
    }

    public String getNome_animal() {
        return nome_animal;
    }

    public void setNome_animal(String nome_animal) {
        this.nome_animal = nome_animal;
    }

    public int getId_cliente() {
        return id_cliente;
    }

    public void setId_cliente(int id_cliente) {
        this.id_cliente = id_cliente;
    }
}
