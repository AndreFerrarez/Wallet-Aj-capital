//package br.aj.capital.ajCapitalWallet;
//
//import java.io.BufferedReader;
//import java.io.FileReader;
//import java.util.HashMap;
//import java.util.Map;
//
//import org.springframework.boot.ApplicationArguments;
//import org.springframework.boot.ApplicationRunner;
//import org.springframework.core.annotation.Order;
//import org.springframework.stereotype.Component;
//
//import br.aj.capital.ajCapitalWallet.model.domain.Acoes;
// 
//
//@Order(2)
//@Component
//public class AcoesLoader implements ApplicationRunner {
//
//	private Map<String, Acoes> mapa = new HashMap<String, Acoes>();
//
//	@Override
//	public void run(ApplicationArguments args) throws Exception {
//		
//		FileReader file = new FileReader("files/acao.txt");
//		BufferedReader leitura = new BufferedReader(file);
//		
//		String linha = leitura.readLine();
//		String[] campos = null;
//		
//		while(linha != null) {
//			campos = linha.split(";");
//			
//			Acoes acoes = new Acoes();
//		
//			
//			acoes.setCode(campos[0]);
//			acoes.setNome(campos[1]);
//			acoes.setDescricao(campos[2]);
////			acoes.setValorCompra(campos[3]);
////			acoes.setQuantidadeCompra(campos[4]);
//			
//			
//			mapa.put(acoes.getCode(), acoes);
//			
//			linha = leitura.readLine();
//		}
//		for(Acoes acoes : mapa.values()) {
//			System.out.println("[ Acao ] " + acoes);
//		}
//		leitura.close();
//		
//	}
//}
//
