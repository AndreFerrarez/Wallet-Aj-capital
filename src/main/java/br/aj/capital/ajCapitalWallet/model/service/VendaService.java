package br.aj.capital.ajCapitalWallet.model.service;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.aj.capital.ajCapitalWallet.model.domain.Venda;
import br.aj.capital.ajCapitalWallet.model.repositories.VendaRepository;

@Service
public class VendaService {

	@Autowired
	private VendaRepository vendaRepository;

	
	public void incluir(Venda venda) {
		vendaRepository.save(venda);
	}
	
	public Collection<Venda> obterLista() {
		return (Collection<Venda>) vendaRepository.findAll();
	}

	
}
