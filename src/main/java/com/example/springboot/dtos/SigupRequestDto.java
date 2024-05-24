package com.example.springboot.dtos;

import lombok.Data;

@Data
public class SigupRequestDto {

    private Long id;

    private String email;

    private String senha;

    private String nome;

    private String sobrenome;

    private String telefone;


}
