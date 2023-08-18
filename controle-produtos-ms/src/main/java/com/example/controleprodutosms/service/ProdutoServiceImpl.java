package com.example.controleprodutosms.service;

import java.util.List;
import java.util.Optional;
import org.modelmapper.ModelMapper;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.controleprodutosms.model.Produto;
import com.example.controleprodutosms.repository.ProdutoRepositorio;

@Service
public class ProdutoServiceImpl implements ProdutoService {

    @Autowired
    private ProdutoRepositorio repo;

    @Override
    public Produto criarProduto(Produto produto) {
        return salvarProduto(produto);
    }

    @Override
    public List<Produto> obterTodos() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'obterTodos'");
    }

    @Override
    public Optional<Produto> obterPorId(Integer id) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'obterPorId'");
    }

    @Override
    public void removerProduto(Integer id) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'removerProduto'");
    }

    @Override
    public Produto atualizarProduto(Integer id, Produto produto) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'atualizarProduto'");
    }

    private Produto salvarProduto(Produto produto) {
        ModelMapper mapper = new ModelMapper();
        Produto produtoEntidade = mapper.map(produto, Produto.class);
        produtoEntidade = repo.save(produtoEntidade);

        return mapper.map(produtoEntidade, Produto.class);
    }
    
}
