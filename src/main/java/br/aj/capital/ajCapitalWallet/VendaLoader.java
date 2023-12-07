package br.aj.capital.ajCapitalWallet;

import java.io.BufferedReader;
import java.io.FileReader;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import br.aj.capital.ajCapitalWallet.model.domain.Investidor;
import br.aj.capital.ajCapitalWallet.model.domain.Venda;
import br.aj.capital.ajCapitalWallet.model.service.VendaService;

@Order(4)
@Component
public class VendaLoader implements ApplicationRunner{
	

	
	@Autowired
	private VendaService vendaService;

	@Override
	public void run(ApplicationArguments args) throws Exception {
		FileReader file = new FileReader("files/venda.txt");
		BufferedReader leitura = new BufferedReader(file);
		
		String linha = leitura.readLine();
		
		String[] campos = null;
		
		while (linha  != null) {
			campos = linha.split(";");
			
			Investidor investidor = new Investidor();
			investidor.setId(Integer.valueOf(campos[5].trim()));
						
			Venda venda = new Venda();
			
			venda.setCode(campos[0]);
			venda.setNome(campos[1]);
			venda.setDescricao(campos[2]);
			venda.setValorVenda(Float.valueOf(campos[3]));
			venda.setQuantidadeVenda(Float.valueOf(campos[4]));
			
			venda.setInvestidor(investidor);
			
			vendaService.incluir(venda);
			
			linha = leitura.readLine();		
		}
		
		for(Venda venda : vendaService.obterLista()) {
			System.out.println("[Acoes Vendidas] " + venda);
		}
		
		leitura.close();
	}

}
