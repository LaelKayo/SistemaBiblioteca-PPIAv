package br.edu.fafic.ppi.domain;

import java.io.Serializable;

import javax.persistence.Embeddable;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;

import br.edu.fafic.ppi.enuns.Periodo;

@Embeddable
public class Curso implements Serializable{

	private static final long serialVersionUID = 1L;
	
	private String nome;
	
	@Enumerated(EnumType.ORDINAL)
	private Periodo periodo;

	public Curso(String nome, Periodo periodo) {
		super();
		this.nome = nome;
		this.periodo = periodo;
	}
	
	public Curso() {
		
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Periodo getPeriodo() {
		return periodo;
	}

	public void setPeriodo(Periodo periodo) {
		this.periodo = periodo;
	}
	
}
