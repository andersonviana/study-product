package com.product.product.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
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
     * Metodo para obter por id no service
     * @param id
     * @return um produto repository por id
     */
    @GetMapping("/{id}")
    public Optional<Produto> obterPorid(@PathVariable Integer id){
        return produtoService.obterPorid(id);
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

    /**
     * Metodo para deletar um produto
     * @param id
     * @return mensgem de produto deletado
     */
    @DeleteMapping("/{id}")
    public String deletar(@PathVariable Integer id){
        produtoService.deletar(id);
        return "Produto com id: " + id + " foi deletado com sucesso";
    }

    /**
     * Endpoint para adicionar um produto.
     * @param produto
     * @return Produto criado.
     */
    @PutMapping("{id}/atualizar")
    public Produto atualizarProduto(@RequestBody Produto produto, @PathVariable Integer id){
        return produtoService.atualizar(id, produto);
    }



}
