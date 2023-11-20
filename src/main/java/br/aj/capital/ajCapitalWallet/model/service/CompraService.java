package br.aj.capital.ajCapitalWallet.model.service;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Service;

import br.aj.capital.ajCapitalWallet.model.domain.Compra;

@Service
public class CompraService {

	private Map<String, Compra> mapa = new HashMap<String, Compra>();
	
	public void incluir(Compra compra) {
		mapa.put(compra.getCode(), compra);
		
	}
	
	public Collection<Compra> obterLista() {
		return  mapa.values();
	}

	
}
