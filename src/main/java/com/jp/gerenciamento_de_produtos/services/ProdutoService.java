package com.jp.gerenciamento_de_produtos.services;

import com.jp.gerenciamento_de_produtos.models.ProdutoModel;
import com.jp.gerenciamento_de_produtos.repositories.ProdutoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProdutoService {

    @Autowired
    public ProdutoRepository produtoRepository;

    public ProdutoModel criarProduto(ProdutoModel produto){
        return produtoRepository.save(produto);
    }

    public List<ProdutoModel> listarProdutos(){
        return produtoRepository.findAll();
    }

    public ProdutoModel buscarProdutoPorId(Long id){
        return produtoRepository.findById(id).get();
    }

    public void deletarProduto(Long id){
        produtoRepository.deleteById(id);
    }

}
