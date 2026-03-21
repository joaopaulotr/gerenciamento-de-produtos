package com.jp.gerenciamento_de_produtos.controller;


import com.jp.gerenciamento_de_produtos.models.ProdutoModel;
import com.jp.gerenciamento_de_produtos.repositories.ProdutoRepository;
import com.jp.gerenciamento_de_produtos.services.ProdutoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "/produtos")

public class ProdutoController {

    @Autowired
    private ProdutoService produtoService;

    @GetMapping
    public List<ProdutoModel> findAll(){
        return produtoService.listarProdutos();
    }

    @DeleteMapping
    public void deletarProduto(@RequestParam Long id){
        produtoService.deletarProduto(id);
    }

    @GetMapping
    public ProdutoModel findById(@RequestParam Long id){
        return produtoService.buscarProdutoPorId(id);
    }
    @PostMapping
    public ProdutoModel adicionarProduto(@RequestBody ProdutoModel produto){
        return produtoService.criarProduto(produto);
    }
}
