package br.edu.fafic.ppi.domain;


import javax.persistence.Entity;

import br.edu.fafic.ppi.enuns.Genero;

@Entity
public class Bibliotecario extends Usuario {

	private static final long serialVersionUID = 1L;

	public Bibliotecario(Long id, String nome, Long cpf, Genero genero, String matricula, Endereco endereco,
			Contato contato, Login login) {
		super(id, nome, cpf, genero, matricula, endereco, contato, login);
	}

	public Bibliotecario() {
		
	}
	
}