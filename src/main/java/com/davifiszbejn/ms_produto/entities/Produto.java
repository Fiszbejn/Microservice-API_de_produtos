package com.davifiszbejn.ms_produto.entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor
@Getter
@Setter
public class Produto {
    private Long id;
    private String nome;
    private String descricao;
    private Double valor;
}
