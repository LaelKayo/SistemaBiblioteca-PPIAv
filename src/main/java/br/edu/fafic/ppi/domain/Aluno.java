package br.edu.fafic.ppi.domain;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.OneToOne;

import br.edu.fafic.ppi.enuns.Genero;
import br.edu.fafic.ppi.enuns.Periodo;

@Entity
public class Aluno extends Usuario{

	
	private static final long serialVersionUID = 1L;

	
	@OneToOne
	private Curso curso;
	
	
	@Enumerated(EnumType.ORDINAL)
	private Periodo periodo;
	
	
	
	


	public Aluno(String nome, Long cpf, Genero genero, Endereco endereco, Contato contato,
			Login login, Curso curso, Periodo periodo) {
		super(nome, cpf, genero, endereco, contato, login);
		this.curso = curso;
		this.periodo = periodo;
	}
	public Aluno() {
		// TODO Auto-generated constructor stub
	}


	public Curso getCurso() {
		return curso;
	}


	public void setCurso(Curso curso) {
		this.curso = curso;
	}


	public Periodo getPeriodo() {
		return periodo;
	}


	public void setPeriodo(Periodo periodo) {
		this.periodo = periodo;
	}
	@Override
	public String toString() {
		return "Aluno [curso=" + curso + ", periodo=" + periodo + "]";
	}
	
	
	
	
	
}
