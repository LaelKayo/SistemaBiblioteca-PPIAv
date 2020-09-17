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

import br.edu.fafic.ppi.domain.Aluno;
import br.edu.fafic.ppi.service.AlunoService;

@RestController
@RequestMapping(value = "/aluno")
public class AlunoResource {

	@Autowired
	private AlunoService as;

	@PostMapping
	public ResponseEntity<?> inserir(@RequestBody Aluno aluno) {
		return new ResponseEntity<>(as.inserir(aluno), HttpStatus.OK);
	}

	@GetMapping(path = "/{id}")
	public ResponseEntity<?> findById(@PathVariable Long id) throws Exception {
		return new ResponseEntity<>(as.findById(id), HttpStatus.OK);
	}

	@PutMapping
	public ResponseEntity<?> update(@RequestBody Aluno aluno) throws Exception {
		return new ResponseEntity<>(as.update(aluno), HttpStatus.OK);
	}

	@DeleteMapping
	public ResponseEntity<?> deleteById(@PathVariable Long id) throws Exception {
		return new ResponseEntity<>(as.deleteById(id), HttpStatus.OK);
	}
}
