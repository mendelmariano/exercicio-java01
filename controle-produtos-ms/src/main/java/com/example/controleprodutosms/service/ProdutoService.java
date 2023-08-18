package com.example.controleprodutosms.service;

import java.util.List;
import java.util.Optional;

import com.example.controleprodutosms.model.Produto;

public interface ProdutoService {
   Produto criarProduto(Produto produto);
   List<Produto> obterTodos();
   Optional<Produto> obterPorId(Integer id);
   void removerProduto(Integer id);
   Produto atualizarProduto(Integer id, Produto produto);
}
