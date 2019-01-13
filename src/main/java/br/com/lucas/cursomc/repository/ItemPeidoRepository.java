package br.com.lucas.cursomc.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.lucas.cursomc.domain.ItemPedido;

@Repository
public interface ItemPeidoRepository extends JpaRepository<ItemPedido, Integer> {

}
