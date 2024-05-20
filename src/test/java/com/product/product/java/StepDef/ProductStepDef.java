package com.product.product.java.StepDef;


import com.product.product.model.Produto;
import io.cucumber.datatable.DataTable;
import io.cucumber.java8.Pt;

import java.util.List;

public class ProductStepDef implements Pt {
    public ProductStepDef() {

        Dado("^que o cliente adiciona um produto de ids:$", (DataTable dataTable) -> {
            List<List<String>> produtoList = dataTable.asLists(String.class);
            System.out.println(produtoList.size());

            produtoList.stream()
                    .skip(1)
                    .filter(e -> e.contains("caneta"))
                    .findFirst();

            System.out.println(produtoList.toString());

            List<List<String>> caneta = produtoList.stream()
                    .skip(1)
                    .filter(e -> e.contains("caneta"))
                    .toList();


            caneta.stream().forEach(e -> System.out.println(e));
            System.out.println(caneta.size());

            for (List<String> eas : produtoList) {
                System.out.println("\n " + eas.toString());
            }
        });
        Quando("^o cliente envia a solicitacao de cadastro$", () -> {
            System.out.println("Envia a solicitacao de cadastro");
        });
        Entao("^o cliente recebe o response com todos os produtos cadastrados$", () -> {
            System.out.println("O produto � cadastrado");
        });
        E("^o id enviado foi ignorado$", () -> {
            System.out.println("Envia  o id enviado � ignorado");
        });

    }
}

