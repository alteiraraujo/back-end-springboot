package com.example.springboot.controllers;

import com.example.springboot.dtos.SigupRequestDto;
import com.example.springboot.dtos.UserDto;
import com.example.springboot.servicos.authentication.AuthService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ControleAutenticacao {

    @Autowired
    private AuthService authService;
    @PostMapping("/client/sign-up")
    public ResponseEntity<?> signupClient(@RequestBody SigupRequestDto sigupRequestDto){


        if(authService.presentByEmail(sigupRequestDto.getEmail()))
        {
            return new ResponseEntity<>("Exixte um cliente cadastrado com esse Email!", HttpStatus.NOT_ACCEPTABLE);
        }
        UserDto createdUser = authService.signupClient(sigupRequestDto);
        return new ResponseEntity<>(createdUser, HttpStatus.OK);
    }
}
