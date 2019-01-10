package br.com.lucas.cursomc.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.lucas.cursomc.domain.Cidade;

public interface CidadeRepository extends JpaRepository<Cidade, Integer>{

}
