package br.aj.capital.ajCapitalWallet.model.service;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Service;

import br.aj.capital.ajCapitalWallet.model.domain.Compra;
import br.aj.capital.ajCapitalWallet.model.domain.Venda;

@Service
public class VendaService {

	private Map<String, Venda> mapa = new HashMap<String, Venda>();
	
	public void incluir(Venda venda) {
		mapa.put(venda.getCode(), venda);
		
	}
	
	public Collection<Venda> obterLista() {
		return  mapa.values();
	}

	
}
