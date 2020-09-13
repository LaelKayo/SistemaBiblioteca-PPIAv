package br.edu.fafic.ppi.resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import br.edu.fafic.ppi.domain.Livro;
import br.edu.fafic.ppi.repository.LivroRepository;
import br.edu.fafic.ppi.service.LivroService;

@RestController
@RequestMapping(value = "/livro")
public class LivroResource {

	@Autowired
	private LivroRepository ls;
	
	
	
	@RequestMapping(method = RequestMethod.POST)
	public ResponseEntity<Livro> save(Livro l){
		ls.save(l);
		
		return ResponseEntity.ok().body(l);
		
	}
	
}
