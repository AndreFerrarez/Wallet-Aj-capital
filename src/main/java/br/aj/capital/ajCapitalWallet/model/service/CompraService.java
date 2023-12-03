package br.aj.capital.ajCapitalWallet.model.service;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.aj.capital.ajCapitalWallet.model.domain.Compra;
import br.aj.capital.ajCapitalWallet.model.repositories.CompraRepository;

@Service
public class CompraService {

	@Autowired
	private CompraRepository compraRepository;


	
	public void incluir(Compra compra) {
		compraRepository.save(compra);
	}
	
	public Collection<Compra> obterLista() {
		return (Collection<Compra>) compraRepository.findAll();
	}

	
}
