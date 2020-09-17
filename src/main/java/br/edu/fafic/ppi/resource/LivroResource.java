package br.edu.fafic.ppi.resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.edu.fafic.ppi.domain.Livro;
import br.edu.fafic.ppi.service.LivroService;

@RestController
@RequestMapping(value = "/livro")
public class LivroResource {

	@Autowired
	private LivroService ls;

	@PostMapping
	public ResponseEntity<?> inserir(@RequestBody Livro livro) {
		return new ResponseEntity<>(ls.inserir(livro), HttpStatus.OK);
	}

	@GetMapping(path = "/{id}")
	public ResponseEntity<?> findById(@PathVariable Long id) throws Exception {
		return new ResponseEntity<>(ls.findById(id), HttpStatus.OK);
	}

	@PutMapping
	public ResponseEntity<?> update(@RequestBody Livro livro) throws Exception {
		return new ResponseEntity<>(ls.update(livro), HttpStatus.OK);
	}

	@DeleteMapping
	public ResponseEntity<?> deleteById(@PathVariable Long id) throws Exception {
		return new ResponseEntity<>(ls.deleteById(id), HttpStatus.OK);
	}

}
