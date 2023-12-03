package br.aj.capital.ajCapitalWallet.model.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.aj.capital.ajCapitalWallet.model.domain.Compra;

@Repository
public interface CompraRepository extends CrudRepository<Compra, Integer> {

}
