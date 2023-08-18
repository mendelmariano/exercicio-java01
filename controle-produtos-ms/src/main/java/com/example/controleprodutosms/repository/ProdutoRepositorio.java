package com.example.controleprodutosms.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.controleprodutosms.model.Produto;

@Repository
public interface ProdutoRepositorio extends JpaRepository<Produto, Integer> {
    
}
