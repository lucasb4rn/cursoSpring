package br.com.lucas.cursomc.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.lucas.cursomc.domain.Produto;

public interface ProdutoRepository extends JpaRepository<Produto, Integer>{

}
