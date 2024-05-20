package com.product.product.model.error;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor
public class ErrorMessage {
    @Getter
    @Setter
    private String titulo;
    @Getter
    @Setter
    private Integer status;
    @Getter
    @Setter
    private String mensagem;
}
