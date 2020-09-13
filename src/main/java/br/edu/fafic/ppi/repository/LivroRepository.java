package br.edu.fafic.ppi.repository;




import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.edu.fafic.ppi.domain.Livro;



@Repository
public interface LivroRepository extends JpaRepository<Livro, Long>{
	
	
	
}
