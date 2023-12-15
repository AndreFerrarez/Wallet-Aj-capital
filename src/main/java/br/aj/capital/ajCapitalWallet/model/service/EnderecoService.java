package br.aj.capital.ajCapitalWallet.model.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.aj.capital.ajCapitalWallet.clients.IEnderecoClient;
import br.aj.capital.ajCapitalWallet.model.domain.Endereco;

@Service
public class EnderecoService {

	@Autowired
	private IEnderecoClient enderecoClient;
	
	public Endereco buscarCep(String cep){
		return enderecoClient.buscarCep(cep);
		
	}
}
