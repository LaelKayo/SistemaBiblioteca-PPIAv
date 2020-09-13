package br.edu.fafic.ppi.domain;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Embeddable
public class Login implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	@Column(unique = true, length = 6)
	private int matricula;
	
	private String senha;
	
	public Login(int matricula, String senha) {
		super();
		this.matricula = matricula;
		this.senha = senha;
	}
	
	public Login() {
		
	}

	public int getMatricula() {
		return matricula;
	}

	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}
}
