package br.aj.capital.ajCapitalWallet.model.service;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.aj.capital.ajCapitalWallet.model.domain.Acoes;
import br.aj.capital.ajCapitalWallet.model.repositories.AcoesRepository;

@Service
public class AcoesService {
	
	@Autowired
	private AcoesRepository acoesRepository;

	
	public void incluir(Acoes acoes) {
		acoesRepository.save(acoes);
	}
	
	public Collection<Acoes> obterLista() {
		return (Collection<Acoes>) acoesRepository.findAll();
	}

}
