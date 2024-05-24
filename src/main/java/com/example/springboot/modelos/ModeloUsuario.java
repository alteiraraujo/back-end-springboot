package com.example.springboot.modelos;

import com.example.springboot.dtos.UserDto;
import com.example.springboot.enums.UserRole;
import jakarta.persistence.*;
import lombok.Data;


@Entity
@Table(name="tbl_usuarios")
@Data

public class ModeloUsuario {

 @Id
 @GeneratedValue(strategy = GenerationType.IDENTITY)
 private Long id;

 private String email;

 private String senha;

 private String nome;

 private String sobrenome;

 private String telefone;

 private UserRole role;

 public UserDto getDto(){
  UserDto userDto = new UserDto();
  userDto.setId(id);
  userDto.setNome(nome);
  userDto.setEmail(email);
  userDto.setRole(role);

  return userDto;
  }
}
