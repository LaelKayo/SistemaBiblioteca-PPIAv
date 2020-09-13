package br.edu.fafic.ppi.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.edu.fafic.ppi.domain.Livro;

import br.edu.fafic.ppi.exepction.ObjectNaoEncontradoException;
import br.edu.fafic.ppi.repository.LivroRepository;

@Service
public class LivroService {

	@Autowired
	private LivroRepository lr;

	
}
