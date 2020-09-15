package br.edu.fafic.ppi.domain;

import javax.persistence.Entity;

import br.edu.fafic.ppi.enuns.Genero;

@Entity
public class Bibliotecario extends Usuario {

	private static final long serialVersionUID = 1L;

	public Bibliotecario(String nome, Long cpf, Genero genero, Endereco endereco, Contato contato, Login login) {
		super(nome, cpf, genero, endereco, contato, login);
	}

	public Bibliotecario() {

	}

}