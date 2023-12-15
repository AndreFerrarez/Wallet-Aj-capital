package br.aj.capital.ajCapitalWallet;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class AjCapitalWalletApplication {

	public static void main(String[] args) {
		SpringApplication.run(AjCapitalWalletApplication.class, args);
	}

}
