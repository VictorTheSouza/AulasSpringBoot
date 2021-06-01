package org.generation.minhaLojaDeGames.Repository;

import java.util.List;

import org.generation.minhaLojaDeGames.model.Produto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProdutoRepository extends JpaRepository<Produto, Long> {
	public List <Produto> findAllByNomeProdutoContainingIgnoreCase(String nomeProduto);

}
