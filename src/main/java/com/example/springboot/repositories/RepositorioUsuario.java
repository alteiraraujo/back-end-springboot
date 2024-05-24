package com.example.springboot.repositories;

import com.example.springboot.modelos.ModeloUsuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RepositorioUsuario extends JpaRepository<ModeloUsuario, Long> {

    ModeloUsuario findFirstByEmail(String email);
}
