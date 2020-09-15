package br.edu.fafic.ppi.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.edu.fafic.ppi.domain.Professor;
import br.edu.fafic.ppi.repository.ProfessorRepository;

@Service
public class ProfessorService {

	@Autowired
	private ProfessorRepository pr;
	
	private Professor inserir(Professor professor) {
		return pr.save(professor);
	}
	
	public Professor findById(Long id) throws Exception{
		Optional<Professor> p = pr.findById(id);
		return p.orElseThrow(() -> new Exception("Erro ao encontrar o professor"));
	}
	
	public Professor update(Professor professor) {
		return pr.save(professor);
	}
	
	public boolean deleteById(Long id) {
		pr.deleteById(id);
		return true;
	}
}
