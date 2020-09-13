package br.edu.fafic.ppi.domain;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import br.edu.fafic.ppi.enuns.Area;

@Entity
public class Livro implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(nullable = false, length = 100)
	private String nome;
	
	@Column(unique = true,length = 10)
	private String isbn;
	
	
	@Enumerated(EnumType.ORDINAL)
	private Area area;

	
	
	
	
	public Livro() {
		// TODO Auto-generated constructor stub
	}

	public Livro(Long id, String nome, String isbn, Area area) {
		super();
		this.id = id;
		this.nome = nome;
		this.isbn = isbn;
		this.area = area;
	}


	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	}


	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public String getIsbn() {
		return isbn;
	}


	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}


	public Area getArea() {
		return area;
	}


	public void setArea(Area area) {
		this.area = area;
	}


	@Override
	public String toString() {
		return "Livro [id=" + id + ", nome=" + nome + ", isbn=" + isbn + ", area=" + area + "]";
	}
	
	
	
	

}
