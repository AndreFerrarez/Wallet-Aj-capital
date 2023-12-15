package br.aj.capital.ajCapitalWallet;

import java.io.BufferedReader;
import java.io.FileReader;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import br.aj.capital.ajCapitalWallet.model.domain.Endereco;
import br.aj.capital.ajCapitalWallet.model.domain.Investidor;
import br.aj.capital.ajCapitalWallet.model.service.EnderecoService;
import br.aj.capital.ajCapitalWallet.model.service.InvestidorService;

@Order(1)
@Component
public class InvestidorLoader implements ApplicationRunner {

	@Autowired
	private InvestidorService investidorService;
	
	@Autowired
	private EnderecoService enderecoService;

	@Override
	public void run(ApplicationArguments args) throws Exception {

		FileReader file = new FileReader("files/investidor.txt");
		BufferedReader leitura = new BufferedReader(file);

		String linha = leitura.readLine();

		String[] campos = null;

		
		
		
		while (linha != null) {
			
			campos = linha.split(";");

			String cep = campos[3];
			Endereco endereco =  enderecoService.buscarCep(cep);
			
			Investidor investidor = new Investidor();

			investidor.setNome(campos[0]);
			investidor.setCpf(campos[1]);
			investidor.setEmail(campos[2]);
			investidor.setEndereco(endereco);
		
			
			investidorService.incluir(investidor);
		
			linha = leitura.readLine();
		
		
		}
		

		for (Investidor investidor : investidorService.obterLista()) {
			System.out.println("[Investidor] " + investidor);
		}

		leitura.close();
		


	}
	

}