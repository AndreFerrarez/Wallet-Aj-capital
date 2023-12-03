package br.aj.capital.ajCapitalWallet.model.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "TAnalise")
public class Analise extends Acoes {
	

	
	public String analise;
	
	@Override
	public String toString() {
		return String.format("%s - Analise: *%s*" , super.toString() ,analise);
	}
	
	public String getAnalise () {
		return analise;
	}

	public void setAnalise(String analise) {
		this.analise = analise;
	}
	

}
