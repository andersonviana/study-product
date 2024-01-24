package com.product.product.model;

import lombok.Getter;
import lombok.Setter;

public class Produto {

    @Getter
    @Setter
    private int id;

    @Getter
    @Setter
    private String nome;

    @Getter
    @Setter
    private int quantidade;

    @Getter
    @Setter
    private double valor;

    @Getter
    @Setter
    private String observacao;
}
