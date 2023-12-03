package br.aj.capital.ajCapitalWallet.model.service;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.aj.capital.ajCapitalWallet.model.domain.Investidor;
import br.aj.capital.ajCapitalWallet.model.repositories.InvestidorRepository;

@Service
public class InvestidorService {
	
	@Autowired
	private InvestidorRepository investidorRepository;


	
	public void incluir(Investidor investidor) {
		investidorRepository.save(investidor);
	}
	
	public Collection<Investidor> obterLista() {
		return (Collection<Investidor>) investidorRepository.findAll();
	}
}
