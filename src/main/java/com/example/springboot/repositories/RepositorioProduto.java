package com.example.springboot.repositories;

import com.example.springboot.modelos.ModeloProduto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface RepositorioProduto extends JpaRepository<ModeloProduto, UUID>{
}
