package br.edu.fafic.ppi.domain;


import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.OneToMany;

import br.edu.fafic.ppi.enuns.Area;
import br.edu.fafic.ppi.enuns.Genero;

@Entity
public class Professor extends Usuario{


	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	
	
	@OneToMany
	private Curso curso;
	
	
	@Enumerated(EnumType.ORDINAL)
	private Area area;
	
	
	

	public Professor() {
	}




	public Professor(Long id, String nome, Long cpf, Genero genero, String matricula, Endereco endereco,
			Contato contato, Login login, Curso curso, Area area) {
		super(id, nome, cpf, genero, matricula, endereco, contato, login);
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
