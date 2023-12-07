package br.aj.capital.ajCapitalWallet.model.domain;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "T_Venda")
public class Venda extends Acoes {
	


	public float valorVenda;
	public float quantidadeVenda;
	
	@Override
    public String toString() {
        return String.format("%s - Acoes vendidas: - Valor de Venda (%s) - Quantidade Vendida (%s)",
                super.toString(), valorVenda, quantidadeVenda);
    }
	
	
	public double getValorVenda() {
		return valorVenda;
	}
	public void setValorVenda(float valorVenda) {
		this.valorVenda = valorVenda;
	}
	public float getQuantidadeVenda() {
		return quantidadeVenda;
	}
	public void setQuantidadeVenda(float quantidadeVenda) {
		this.quantidadeVenda = quantidadeVenda;
	}
	
	
}
