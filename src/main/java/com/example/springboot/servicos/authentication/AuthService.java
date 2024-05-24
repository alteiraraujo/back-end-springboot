package com.example.springboot.servicos.authentication;

import com.example.springboot.dtos.SigupRequestDto;
import com.example.springboot.dtos.UserDto;

public interface AuthService {

    UserDto signupClient(SigupRequestDto signupRequestDto);

    Boolean presentByEmail(String email);
}
