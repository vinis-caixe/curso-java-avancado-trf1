package br.cnj.segundo_projeto.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.cnj.segundo_projeto.model.entities.Caixa;


@Repository
public interface CaixaRepository extends JpaRepository<Caixa, Long> {
    Caixa findById_caixa(Long id_caixa);
}
