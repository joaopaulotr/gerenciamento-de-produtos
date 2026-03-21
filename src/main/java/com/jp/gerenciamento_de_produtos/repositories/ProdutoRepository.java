package com.jp.gerenciamento_de_produtos.repositories;

import com.jp.gerenciamento_de_produtos.models.ProdutoModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProdutoRepository extends JpaRepository<ProdutoModel, Long> {
}
