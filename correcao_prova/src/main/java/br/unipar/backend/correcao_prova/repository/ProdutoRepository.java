package br.unipar.backend.correcao_prova.repository;

import br.unipar.backend.correcao_prova.model.Produto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProdutoRepository extends JpaRepository<Produto, Long> {
}
