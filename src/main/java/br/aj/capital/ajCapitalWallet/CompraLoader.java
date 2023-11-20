package br.aj.capital.ajCapitalWallet;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import br.aj.capital.ajCapitalWallet.model.domain.Compra;
import br.aj.capital.ajCapitalWallet.model.service.CompraService;
import br.aj.capital.ajCapitalWallet.model.service.InvestidorService;

@Order(3)
@Component
public class CompraLoader implements ApplicationRunner {
	

	
	@Autowired
	private CompraService compraService;

	@Override
	public void run(ApplicationArguments args) throws Exception {
		
		FileReader file = new FileReader("files/compra.txt");
		BufferedReader leitura = new BufferedReader(file);
		
		String linha = leitura.readLine();
		
		String[] campos = null;
		
		while (linha  != null) {
			campos = linha.split(";");
						
			Compra compra = new Compra();
			
			compra.setCode(campos[0]);
			compra.setNome(campos[1]);
			compra.setDescricao(campos[2]);
			compra.setValorCompra(campos[3]);
			compra.setQuantidadeCompra(campos[4]);
			
		
			compraService.incluir(compra);
			
			linha = leitura.readLine();		
		}
		
		for(Compra compra : compraService.obterLista()) {
			System.out.println("[Acoes compradas] " + compra);
		}
		
		leitura.close();
		
	}

}
