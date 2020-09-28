package br.edu.fafic.ppi.resource;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
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
	private LivroRepository lr;
	
	@Autowired
	private LivroService ls;
	
	
	@RequestMapping(method = RequestMethod.POST)
	public ResponseEntity<Livro> save(@RequestBody Livro l){
		lr.save(l);
		
		return ResponseEntity.ok().body(l);
		
	}
	
	@RequestMapping(value = "/update",method = RequestMethod.PUT)
	public ResponseEntity<Livro> update(@RequestBody Livro l){
		lr.save(l);
		
		return ResponseEntity.ok().body(l);
		
	}
	
	
	@RequestMapping(value = "/isbn/{isbn}", method = RequestMethod.GET)
	public ResponseEntity<Livro> findByLivroByIsbn(@PathVariable String isbn) throws Exception {
		Livro l = ls.findByIsbn(isbn);

		return ResponseEntity.ok().body(l);
	}

	@RequestMapping(value = "/area/{area}", method = RequestMethod.GET)
	public ResponseEntity<Livro> findByLivroByArea(@PathVariable String area) throws Exception {
		Livro l = ls.findByArea(area);

		return ResponseEntity.ok().body(l);
	}

	@RequestMapping(value = "/nome/{nome}", method = RequestMethod.GET)
	public ResponseEntity<Livro> findByLivroByNome(@PathVariable String nome) throws Exception {
		Livro l = ls.findByNome(nome);

		return ResponseEntity.ok().body(l);
	}

	@RequestMapping(value = "/quant", method = RequestMethod.GET)
	public ResponseEntity<List<Livro>> findByLivroQuantDisponivel() throws Exception {

		return ResponseEntity.ok().body(ls.findByLivroQuantDisponivel());
	}
	
	@RequestMapping(value = "/delete/{id}", method = RequestMethod.DELETE)
	public ResponseEntity<List<Livro>> findByLivroQuantDisponivel(Long id) {
		
		
		ls.deleteById(id);
		
		return ResponseEntity.ok().build();
	}

}
