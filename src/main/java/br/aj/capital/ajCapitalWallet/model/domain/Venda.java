package br.aj.capital.ajCapitalWallet.model.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "TVenda")
public class Venda extends Acoes {
	


	public double valorVenda;
	public float quantidadeVenda;
	
	@Override
	public String toString() {
		return String.format("%s - Valor de Venda *%s* - Quantidade Vendida *%s* ", super.toString(), valorVenda, quantidadeVenda);
	}
	
	
	public double getValorVenda() {
		return valorVenda;
	}
	public void setValorVenda(double valorVenda) {
		this.valorVenda = valorVenda;
	}
	public float getQuantidadeVenda() {
		return quantidadeVenda;
	}
	public void setQuantidadeVenda(float quantidadeVenda) {
		this.quantidadeVenda = quantidadeVenda;
	}
	
	
}
