package br.edu.fafic.ppi.domain;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;

import br.edu.fafic.ppi.enuns.Genero;

@Entity
@Inheritance(strategy = InheritanceType.JOINED)
public class Usuario implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(nullable = false, length = 50)
	private String nome;
	
	@Column(unique = true)
	private Long cpf;

	@Enumerated(EnumType.ORDINAL)
	private Genero genero;
	
	@Column(unique = true, length = 6)
	private String matricula;
	
	@Embedded
	private Endereco endereco;
	
	@Embedded
	private Contato contato;
	
	@Embedded
	private Login login;

	public Usuario(Long id, String nome, Long cpf, Genero genero, String matricula, Endereco endereco, Contato contato,
			Login login) {
		super();
		this.id = id;
		this.nome = nome;
		this.cpf = cpf;
		this.genero = genero;
		this.endereco = endereco;
		this.contato = contato;
		this.login = login;
	}
	
	


	public Usuario() {
		
	}
	
	public String getMatricula() {
		return matricula;
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

	public Long getCpf() {
		return cpf;
	}

	public void setCpf(Long cpf) {
		this.cpf = cpf;
	}

	public Genero getGenero() {
		return genero;
	}

	public void setGenero(Genero genero) {
		this.genero = genero;
	}

	public Endereco getEndereco() {
		return endereco;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}

	public Contato getContato() {
		return contato;
	}

	public void setContato(Contato contato) {
		this.contato = contato;
	}

	public Login getLogin() {
		return login;
	}

	public void setLogin(Login login) {
		this.login = login;
	}
}