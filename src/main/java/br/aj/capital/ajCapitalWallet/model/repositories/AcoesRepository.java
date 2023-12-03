package br.aj.capital.ajCapitalWallet.model.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.aj.capital.ajCapitalWallet.model.domain.Acoes;

@Repository
public interface AcoesRepository extends CrudRepository<Acoes, Integer> {

}
