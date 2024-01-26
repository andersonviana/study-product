package com.product.product.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.product.product.model.Produto;
import com.product.product.repository.ProdutoRepository;

@Service
public class ProdutoService {

    @Autowired
    private ProdutoRepository produtoRepository;

    /**
     * Metodo para retornar uma lista de produtos
     * @return lista de produtos
     */
    public List<Produto> obterTodos(){
        return produtoRepository.findAll();
    }

    /**
     * Metodo para obter por id no service
     * @param id
     * @return um produto repository por id
     */
    public Optional<Produto> obterPorid(int id){
        return produtoRepository.findById(id);
    }

    /**
     * Metodo para adicionar um produto
     * @param produto
     * @return produto repository apos adicionar um produto
     */
    public Produto adicionar(Produto produto){
        return produtoRepository.save(produto);
    }

    /**
     * Metodo para deletar um produto
     * @param id 
     */
    public void deletar(int id){
        produtoRepository.deleteById(id);
    }

    /**
     * Metodo para atualizar um produto 
     * @param id
     * @param produto
     * @return um produto repository atualizado
     */
    public Produto atualizar(int id, Produto produto){
        produto.setId(id);
        return produtoRepository.save(produto);
    }
}
