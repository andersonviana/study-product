package com.product.product.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.product.product.model.Produto;
import com.product.product.services.ProdutoService;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@RestController
@RequestMapping("/api/produtos")
public class ProdutoController {

    @Autowired
    private ProdutoService produtoService;

    /**
     * Metodo controller que devolve todos os produtos.
     * @return
     */
    @GetMapping("/obtertodos")
    public List<Produto> obterTodos(){
        return produtoService.obterTodos();
    }

    /**
     * Endpoint para adicionar um produto.
     * @param produto
     * @return Produto criado.
     */
    @PostMapping("/adicionarProduto")
    public Produto adicionarProduto(@RequestBody Produto produto){
        return produtoService.adicionar(produto);
    }

}
