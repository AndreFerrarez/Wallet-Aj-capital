package br.aj.capital.ajCapitalWallet.model.domain;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "T_Compra")
public class Compra extends Acoes {

	
	public float valorCompra;
	public float quantidadeCompra;
	
	@Override
    public String toString() {
        return String.format("%s - Acoes Compradas: - Valor de Compra (%s) - Quantidade comprada (%s)",
                super.toString(), valorCompra, quantidadeCompra);
    }
	
	
	
	
	public float getValorCompra() {
		return valorCompra;
	}
	public void setValorCompra(float valorCompra) {
		this.valorCompra = valorCompra;
	}
	public float getQuantidadeCompra() {
		return quantidadeCompra;
	}
	public void setQuantidadeCompra(float quantidadeCompra) {
		this.quantidadeCompra = quantidadeCompra;
	}




	public void setId(Integer valueOf) {
		// TODO Auto-generated method stub
		
	}
	

}