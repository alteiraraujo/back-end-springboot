package com.example.springboot.dtos;


import com.example.springboot.enums.UserRole;
import lombok.Data;

@Data
public class UserDto {

    private Long id;

    private String email;

    private String senha;

    private String nome;

    private String sobrenome;

    private String telefone;

    private UserRole role;
}
