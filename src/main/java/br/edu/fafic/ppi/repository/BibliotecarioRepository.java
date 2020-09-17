package br.edu.fafic.ppi.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import br.edu.fafic.ppi.domain.Aluno;
import br.edu.fafic.ppi.domain.Bibliotecario;
import br.edu.fafic.ppi.domain.Livro;
import br.edu.fafic.ppi.domain.Professor;

@Repository
public interface BibliotecarioRepository extends JpaRepository<Bibliotecario, Long> {
//
//	//Consulta pelo nome do aluno
//	@Query("SELECT a FRFOM Aluno a WHERE a.nome = :nome")
//	public Aluno alunoFindByNome(String nome);
//	
//	//Consulta pelos emprestimos do aluno
//	
//	
//	//Consulta pelas devolucoes do Aluno
//	
//	
//	//Consulta pelas devolucoes em atraso do Aluno
//		
//		
////--------------------------------------------------------------------------
//	//Consulta pelo nome do professor
//	@Query("SELECT p FRFOM Professor p WHERE p.nome = :nome")
//	public Professor professorFindByNome(String nome);
//	
//	//Consulta pelos emprestimos do Professor
//
//	
//	//Consulta pelas devolucoes do professor
//	
//	
//	//Consulta pelas devolucoes em atraso do professor
//	
//	
////-------------------------------------------------------------------------
//	//Consulta pelo nome do livro
//	@Query("SELECT l FROM Livro l WHERE l.nome = :nome")
//	public Livro livroFinfByNome(String nome);
//	
//	//Consulta pelo ISBN do livro
//	@Query("SELECT l FROM Livro WHERE l.isbn = :isbn")
//	public Livro livroFindByIsbn(String isbn);
//	
//	//Consulta Livro por quantidade em estoque
//	
//	
//	//Consulta pelos emprestimos do aluno
//	
//	
//	//Consulta pelos emprestimos do Professor

	
}
