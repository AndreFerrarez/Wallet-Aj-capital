package br.aj.capital.ajCapitalWallet.model.service;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Service;

import br.aj.capital.ajCapitalWallet.model.domain.Analise;

@Service
public class AnaliseService {
	
	private Map<String, Analise> mapa = new HashMap<String, Analise>();
	
	public void incluir(Analise analise) {
		mapa.put(analise.getAnalise(), analise);
	}
	
	public Collection<Analise> obterLista() {
		return  mapa.values();
	}

}
