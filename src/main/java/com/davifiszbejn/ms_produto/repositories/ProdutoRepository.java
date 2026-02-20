package com.davifiszbejn.ms_produto.repositories;

import com.davifiszbejn.ms_produto.entities.Produto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProdutoRepository extends JpaRepository<Produto, Long> {

}
