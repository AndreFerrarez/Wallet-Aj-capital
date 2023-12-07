package br.aj.capital.ajCapitalWallet;

import java.io.BufferedReader;
import java.io.FileReader;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import br.aj.capital.ajCapitalWallet.model.domain.Analise;
import br.aj.capital.ajCapitalWallet.model.domain.Investidor;
import br.aj.capital.ajCapitalWallet.model.service.AnaliseService;

@Order(2)
@Component
public class AnaliseLoader implements ApplicationRunner {

	@Autowired
	private AnaliseService analiseService;

	
	@Override
	public void run(ApplicationArguments args) throws Exception {

		FileReader file = new FileReader("files/analise.txt");
		BufferedReader leitura = new BufferedReader(file);

		String linha = leitura.readLine();

		String[] campos = null;

		while (linha != null) {
			campos = linha.split(";");

			Investidor investidor = new Investidor();
			investidor.setId(Integer.parseInt(campos[4].trim()));


			Analise analise = new Analise();

			analise.setCode(campos[0]);
			analise.setNome(campos[1]);
			analise.setDescricao(campos[2]);
			analise.setAnalise(campos[3]);
			
			
			analise.setInvestidor(investidor);

			analiseService.incluir(analise);

			linha = leitura.readLine();
		}

		for (Analise analise : analiseService.obterLista()) {
			System.out.println("[Acao em analise] " + analise);
		}

		leitura.close();
	}

}
