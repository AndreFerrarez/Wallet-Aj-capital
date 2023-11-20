package br.aj.capital.ajCapitalWallet.model.service;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Service;

import br.aj.capital.ajCapitalWallet.model.domain.Investidor;

@Service
public class InvestidorService {

	private Map<String, Investidor> mapa = new HashMap<String, Investidor>();
	
	public void incluir(Investidor investidor) {
		mapa.put(investidor.getCpf(), investidor);
	}
	
	public Collection<Investidor> obterLista() {
		return mapa.values();
	}
}
