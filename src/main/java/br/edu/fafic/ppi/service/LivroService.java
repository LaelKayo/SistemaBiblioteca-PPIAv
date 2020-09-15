package br.edu.fafic.ppi.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;

import br.edu.fafic.ppi.domain.Livro;

import br.edu.fafic.ppi.repository.LivroRepository;

@Service
public class LivroService {

	@Autowired
	private LivroRepository lr;

	public Livro inserir(Livro livro) {
		return lr.save(livro);
	}
	
	public Livro findById(Long id) throws Exception{
		Optional<Livro> l = lr.findById(id);
		return l.orElseThrow(() -> new Exception("erro ao consultar o livro"));
	}
	
	public Livro update(Livro livro) {
		return lr.save(livro);
	}
	
	public boolean deleteById(Long id) {
		lr.deleteById(id);
		return true;
	}
}
