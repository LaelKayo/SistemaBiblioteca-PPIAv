package br.edu.fafic.ppi.domain;


import java.io.Serializable;

import javax.persistence.Embeddable;

@Embeddable
public class Contato implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	private String email;
	
	private String telefone;
	
	public Contato(String email, String telefone) {
		super();
		this.email = email;
		this.telefone = telefone;
	}
	
	public Contato() {
		
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
}
