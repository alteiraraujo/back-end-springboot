package com.example.springboot.servicos.authentication;

import com.example.springboot.dtos.SigupRequestDto;
import com.example.springboot.dtos.UserDto;
import com.example.springboot.enums.UserRole;
import com.example.springboot.modelos.ModeloUsuario;
import com.example.springboot.repositories.RepositorioUsuario;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AuthServiceImpl implements AuthService{

    @Autowired
    private RepositorioUsuario repositorioUsuario;

  public UserDto signupClient(SigupRequestDto signupRequestDto){
    ModeloUsuario user = new ModeloUsuario();

    user.setNome(signupRequestDto.getNome());
    user.setSobrenome(signupRequestDto.getSobrenome());
    user.setEmail(signupRequestDto.getEmail());
    user.setTelefone(signupRequestDto.getTelefone());
    user.setSenha(signupRequestDto.getSenha());

    user.setRole(UserRole.CLIENTE);

    return repositorioUsuario.save(user).getDto();
  }
  public Boolean presentByEmail(String email){
    return repositorioUsuario.findFirstByEmail(email) != null;

  }
}
