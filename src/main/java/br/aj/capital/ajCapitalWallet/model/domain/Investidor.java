package br.aj.capital.ajCapitalWallet.model.domain;

import java.util.Collection;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "T_Investidor")
public class Investidor {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;

	private String nome;
	private String cpf;
	private String email;

	
	@OneToMany(mappedBy = "investidor", cascade = CascadeType.ALL, orphanRemoval = true, fetch = FetchType.EAGER)
	private List<Acoes> acoesList;

	@Override
    public String toString() {
        return String.format("ID %d - Investidor: Nome: %s - CPF: %s - Email: %s {Lista de acoes: %s}", id, nome, cpf, email, acoesList);
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
		return acoesList;
	}

	public void setAcoes(Collection<Acoes> acoesList) {
		this.acoesList = (List<Acoes>) acoesList;
	}

}
