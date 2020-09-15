package br.edu.fafic.ppi.domain;


import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;



@Entity
public class Emprestimo implements Serializable{
	
	
	
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	
	
	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	}

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Temporal(TemporalType.DATE)
	private Date dataEmprestimo;
	
	@Column(length = 3)
	@OneToMany
	private List<Livro> livrosLocados;
	
	
	public Emprestimo() {
		// TODO Auto-generated constructor stub
	}
	

	public Emprestimo(Date dataEmprestimo, List<Livro> livrosLocados) {
		super();

		this.dataEmprestimo = dataEmprestimo;
		this.livrosLocados = livrosLocados;
	}




	public Date getDataEmprestimo() {
		return dataEmprestimo;
	}

	public void setDataEmprestimo(Date dataEmprestimo) {
		this.dataEmprestimo = dataEmprestimo;
	}

	public List<Livro> getLivrosLocados() {
		return livrosLocados;
	}

	public void setLivrosLocados(List<Livro> livrosLocados) {
		this.livrosLocados = livrosLocados;
		
		
	}


	@Override
	public String toString() {
		return "Emprestimo [id=" + id + ", dataEmprestimo=" + dataEmprestimo + ", livrosLocados=" + livrosLocados + "]";
	}
 
	
	
	
	
	
	
}
