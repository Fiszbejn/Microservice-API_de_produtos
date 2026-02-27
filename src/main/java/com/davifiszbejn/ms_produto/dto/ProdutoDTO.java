package com.davifiszbejn.ms_produto.dto;

import com.davifiszbejn.ms_produto.entities.Produto;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Positive;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Getter
public class ProdutoDTO {
    private Long id;

    @NotBlank
    @Size(min = 3, max = 100, message = "O nome deve ter entre 3 e 100 caracteres")
    private String nome;

    @NotBlank
    @Size(min = 10, message = "A descricao deve ter no minimo 10 caracteres")
    private String descricao;

    @NotBlank
    @Positive(message = "O valor deve ser um numero positivo maior do que zero")
    private Double valor;

    public ProdutoDTO(Produto produto) {
        id = produto.getId();
        nome = produto.getNome();
        descricao = produto.getDescricao();
        valor = produto.getValor();
    }
}
