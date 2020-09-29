package br.edu.fafic.ppi.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import br.edu.fafic.ppi.domain.Emprestimo;

@Repository
public interface EmprestimoRepository extends JpaRepository<Emprestimo, Long>{

	@Query("select e from Emprestimo e join e.usuario u where u.nome= :nome")
	public Optional<Emprestimo> findByEmprestimoAluno(String nome);
	
	

	
	
}
