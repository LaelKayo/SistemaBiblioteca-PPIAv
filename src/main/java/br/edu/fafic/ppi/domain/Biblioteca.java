package br.edu.fafic.ppi.domain;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity
public class Biblioteca implements Serializable{

	
	private static final long serialVersionUID = 1L;
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	
	@Column(nullable = false,length = 100)
	private String nome;
	

	@Column(nullable = false,length = 100)
	private String nomeInstituicao;
	
	
	@Column(nullable = false)
	@OneToOne
	private Bibliotecario bibliotecario;
	
	@OneToMany
	private Movimentacao usuarios;
	
	@OneToMany
	private List<Livro> acervo;
	
	
	

	@Override
	public String toString() {
		return "Biblioteca [id=" + id + ", nome=" + nome + ", nomeInstituicao=" + nomeInstituicao + ", bibliotecario="
				+ bibliotecario + ", usuarios=" + usuarios + ", acervo=" + acervo + "]";
	}

	public Biblioteca(String nome, String nomeInstituicao, Bibliotecario bibliotecario, Movimentacao usuarios,
			List<Livro> acervo) {
		super();
		this.nome = nome;
		this.nomeInstituicao = nomeInstituicao;
		this.bibliotecario = bibliotecario;
		this.usuarios = usuarios;
		this.acervo = acervo;
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

	public String getNomeInstituicao() {
		return nomeInstituicao;
	}

	public void setNomeInstituicao(String nomeInstituicao) {
		this.nomeInstituicao = nomeInstituicao;
	}

	public Bibliotecario getBibliotecario() {
		return bibliotecario;
	}

	public void setBibliotecario(Bibliotecario bibliotecario) {
		this.bibliotecario = bibliotecario;
	}

	public Movimentacao getUsuarios() {
		return usuarios;
	}

	public void setUsuarios(Movimentacao usuarios) {
		this.usuarios = usuarios;
	}

	public List<Livro> getAcervo() {
		return acervo;
	}

	public void setAcervo(List<Livro> acervo) {
		this.acervo = acervo;
	}
	
	
}
