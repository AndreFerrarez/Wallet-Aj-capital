package br.aj.capital.ajCapitalWallet.model.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.aj.capital.ajCapitalWallet.model.domain.Investidor;

@Repository
public interface InvestidorRepository extends CrudRepository<Investidor, Integer> {

}
