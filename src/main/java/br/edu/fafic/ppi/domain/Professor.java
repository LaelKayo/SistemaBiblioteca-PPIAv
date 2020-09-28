package br.edu.fafic.ppi.domain;


import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.OneToOne;

import org.hibernate.annotations.Cascade;
import org.hibernate.annotations.CascadeType;

import br.edu.fafic.ppi.enuns.Area;
import br.edu.fafic.ppi.enuns.Genero;

@Entity
public class Professor extends Usuario{


	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	
	
	@OneToOne
	@Cascade(CascadeType.ALL)
	private Curso curso;
	
	
	@Enumerated(EnumType.STRING)
	private Area area;
	
	
	

	public Professor() {
	}




	public Professor(String nome, String cpf, Genero genero, Endereco endereco,
			Contato contato, Login login, Curso curso, Area area) {
		super(nome, cpf, genero, endereco, contato, login);
		this.curso = curso;
		this.area = area;
	}




	public Curso getCurso() {
		return curso;
	}




	public void setCurso(Curso curso) {
		this.curso = curso;
	}




	public Area getArea() {
		return area;
	}




	public void setArea(Area area) {
		this.area = area;
	}




	@Override
	public String toString() {
		return "Professor [curso=" + curso + ", area=" + area + "]";
	}



	
	
	
	
	

}
