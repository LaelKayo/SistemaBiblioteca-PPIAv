package br.edu.fafic.ppi.domain;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;

@Entity
public class Movimentacao implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@ManyToMany
	private List<Usuario> usuarios;
	@OneToMany
	private Emprestimo emprestimo;
	@OneToMany
	private Devolucao devolucao;

	public Movimentacao(List<Usuario> usuarios, Emprestimo emprestimo, Devolucao devolucao) {
		super();
		this.usuarios = usuarios;
		this.emprestimo = emprestimo;
		this.devolucao = devolucao;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public List<Usuario> getUsuarios() {
		return usuarios;
	}

	public void setUsuarios(List<Usuario> usuarios) {
		this.usuarios = usuarios;
	}

	public Emprestimo getEmprestimo() {
		return emprestimo;
	}

	public void setEmprestimo(Emprestimo emprestimo) {
		this.emprestimo = emprestimo;
	}

	public Devolucao getDevolucao() {
		return devolucao;
	}

	public void setDevolucao(Devolucao devolucao) {
		this.devolucao = devolucao;
	}

	@Override
	public String toString() {
		return "Movimentacao [id=" + id + ", usuarios=" + usuarios + ", emprestimo=" + emprestimo + ", devolucao="
				+ devolucao + "]";
	}

}
