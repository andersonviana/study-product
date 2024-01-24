package com.product.product.repository;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Repository;

import com.product.product.model.Produto;

@Repository
public class ProdutoRepository {
    
    private ArrayList<Produto> produtos = new ArrayList<Produto>();
    private int ultimoId=0;

/**
 * Metodo para retornar uma lista de produtos
 * @return lista de produtos
 */
    public List<Produto> obterTodos(){
        return produtos;
    }

/**
 * Metodo que retona o produto encontrado pelo seu id
 * @param id do produto que sera localizado
 * @return Retorna o produto caso seja encontrado.
 */    
    public Optional<Produto> obterPorId(int id){
        return produtos
            .stream()
            .filter(produto -> produto.getId() == id)
            .findFirst();
    }
/**
 * Metodo para adicionar o produto na lista
 * @param produto recebe o parametro produto
 * @return Retorna um produto que que foi adicionado
 */
    public Produto adicionar(Produto produto){
        ultimoId++;
        produto.setId(ultimoId);
        produtos.add(produto);
        return produto;
    }

    /**
     * Metodo para deletar um produto por id
     * @param id do produto para ser deletado
     */
    public void deletar (int id){
        produtos.removeIf(produto -> produto.getId() == id);
    }

    /**
     * metodo para atualizar o produto na lista
     * @param produto
     * @return Retorna o produto apos atualizar a lista
     */
    public Produto atualizar(Produto produto){
        
        Optional<Produto> produtoEncontrado = obterPorId(produto.getId());

        if(produtoEncontrado.isEmpty()){
            throw new InputMismatchException("Produto não encontrado");
        }

        deletar(produto.getId());

        produtos.add(produto);

        return produto;

    }
}
