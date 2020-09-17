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

import br.edu.fafic.ppi.domain.Professor;
import br.edu.fafic.ppi.service.ProfessorService;

@RestController
@RequestMapping(value = "/professor")
public class ProfessorResource {

	@Autowired
	private ProfessorService ps;

	@PostMapping
	public ResponseEntity<?> inserir(@RequestBody Professor professor) {
		return new ResponseEntity<>(ps.inserir(professor), HttpStatus.OK);
	}

	@GetMapping(path = "/{id}")
	public ResponseEntity<?> findById(@PathVariable Long id) throws Exception {
		return new ResponseEntity<>(ps.findById(id), HttpStatus.OK);
	}

	@PutMapping
	public ResponseEntity<?> update(@RequestBody Professor professor) throws Exception {
		return new ResponseEntity<>(ps.update(professor), HttpStatus.OK);
	}

	@DeleteMapping
	public ResponseEntity<?> deleteById(@PathVariable Long id) throws Exception {
		return new ResponseEntity<>(ps.deleteById(id), HttpStatus.OK);
	}
}
