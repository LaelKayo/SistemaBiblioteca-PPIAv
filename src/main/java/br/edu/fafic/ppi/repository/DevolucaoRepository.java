package br.edu.fafic.ppi.repository;

//import java.time.LocalDate;
//import java.util.Date;
//import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import br.edu.fafic.ppi.domain.Devolucao;

@Repository
public interface DevolucaoRepository extends JpaRepository<Devolucao, Long>{

	@Query("select d from Devolucao d join d.emprestimo e join e.usuario u  where u.nome= :nome")
	public Optional<Devolucao> findByDevolucaoByName(String nome);
		
	
	//public Optional<Devolucao> findyByCalculoAtraso(LocalDate dataDevolucao);
}
