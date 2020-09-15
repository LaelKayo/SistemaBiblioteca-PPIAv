package br.edu.fafic.ppi.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.edu.fafic.ppi.domain.Aluno;
import br.edu.fafic.ppi.repository.AlunoRepository;

@Service
public class AlunoService {

	@Autowired
	private AlunoRepository ar;

	public Aluno inserir(Aluno aluno) {
		return ar.save(aluno);
	}

	public Aluno findById(Long id) throws Exception {
		Optional<Aluno> a = ar.findById(id);
		return a.orElseThrow(() -> new Exception("erro ao consultar o aluno"));
	}

	public Aluno update(Aluno aluno) {
		return ar.save(aluno);
	}

	public boolean deleteById(Long id) {
		ar.deleteById(id);
		return true;
	}
}