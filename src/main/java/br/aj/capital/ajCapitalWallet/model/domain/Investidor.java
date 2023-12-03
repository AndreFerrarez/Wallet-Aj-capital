package br.aj.capital.ajCapitalWallet.model.domain;

import java.util.Collection;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "Tinvestidor")
public class Investidor {
	

	@Id
	@GeneratedValue(strategy =GenerationType.IDENTITY)
	private Integer id;
	
	private String nome;
	private String cpf;
	private String email;
	

	@OneToMany(fetch = FetchType.EAGER)
	@JoinColumn(name = "idInvestidor")
	private Collection<Acoes> acoes;
	
	
	@Override 
	public String toString() {
		return String.format("ID *%d - *Nome *%s* cpf *%s* - email *%s* - Lista acoes %s ",id, nome, cpf, email, acoes);
	}
	
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}



	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Collection<Acoes> getAcoes() {
		return acoes;
	}

	public void setAcoes(Collection<Acoes> acoes) {
		this.acoes = acoes;
	}


	
}
