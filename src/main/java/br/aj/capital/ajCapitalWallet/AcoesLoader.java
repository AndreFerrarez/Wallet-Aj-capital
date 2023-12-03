package br.aj.capital.ajCapitalWallet;

import java.io.BufferedReader;
import java.io.FileReader;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import br.aj.capital.ajCapitalWallet.model.domain.Acoes;
import br.aj.capital.ajCapitalWallet.model.domain.Investidor;
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
	
		
		
		while (linha != null) {
			campos = linha.split(";");
			
			Acoes acoes = new Acoes();
			
			acoes.setCode(campos[0]);
			acoes.setNome(campos[1]);
			acoes.setDescricao(campos[2]);
			
			
			Investidor investidor = new Investidor();
			investidor.setId(Integer.valueOf(campos[3]));
	
			
			acoes.setInvestidor(investidor);
			
			acoesService.incluir(acoes);


			linha = leitura.readLine();
		}
		
		for(Acoes ac : acoesService.obterLista()) {
			System.out.println("[ Acoes Service ]" + ac);
		}
	
		leitura.close();

	}
	
	
}













