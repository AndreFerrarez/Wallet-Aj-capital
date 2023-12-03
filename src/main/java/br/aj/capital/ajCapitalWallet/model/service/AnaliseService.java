package br.aj.capital.ajCapitalWallet.model.service;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.aj.capital.ajCapitalWallet.model.domain.Analise;
import br.aj.capital.ajCapitalWallet.model.repositories.AnaliseRepository;

@Service
public class AnaliseService {
	
	
	@Autowired
	private AnaliseRepository analiseRepository;

	
	public void incluir(Analise analise) {
		analiseRepository.save(analise);
	}
	
	public Collection<Analise> obterLista() {
		return (Collection<Analise>) analiseRepository.findAll();
	}

}
