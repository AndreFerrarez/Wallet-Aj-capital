package br.aj.capital.ajCapitalWallet;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import br.aj.capital.ajCapitalWallet.model.domain.Acoes;
import br.aj.capital.ajCapitalWallet.model.domain.Analise;
import br.aj.capital.ajCapitalWallet.model.domain.Compra;
import br.aj.capital.ajCapitalWallet.model.domain.Investidor;
import br.aj.capital.ajCapitalWallet.model.domain.Venda;
import br.aj.capital.ajCapitalWallet.model.service.AcoesService;


@Order(5)
@Component
public class AcoesLoader implements ApplicationRunner {

	@Autowired
	private AcoesService acoesService;

	@Override
	public void run(ApplicationArguments args) throws Exception {

		FileReader file = new FileReader("files/acaoInvestidor.txt");
		BufferedReader leitura = new BufferedReader(file);

		String linha = leitura.readLine();
		String[] campos = null;
		
		Investidor investidor = null;
		Acoes acoes = null;
	
		
		
		while (linha != null) {
			campos = linha.split(";");
			
			switch (campos[0]) {
			case "L":
				
				investidor = new Investidor();
				
				investidor.setId(Integer.valueOf(campos[1]));
				investidor.setAcoesList(new ArrayList<Acoes>());
				
				acoes = new Acoes();
				acoes.setInvestidor(investidor);
				
				
				break;
				
			case "C":
				Compra compra = new Compra();
				compra.setId(Integer.valueOf(campos[1]));
				
				investidor.getAcoesList().add(compra);				
				
				break;
			case "A":
				Analise analise = new Analise();
				analise.setId(Integer.valueOf(campos[1]));
				
				investidor.getAcoesList().add(analise);				
				
				break;
			case "V":
				Venda venda = new Venda();
				venda.setId(Integer.valueOf(campos[1]));
				
				investidor.getAcoesList().add(venda);				
				
				break;
				
			default:
				break;
			}
			
			linha = leitura.readLine();
			
		}
	

		acoesService.incluir(acoes);
		
		for(Acoes ac : acoesService.obterLista()) {
			System.out.println("[ Acoes Service ]" + ac);
		}
	
		leitura.close();

	}
	
	
}
