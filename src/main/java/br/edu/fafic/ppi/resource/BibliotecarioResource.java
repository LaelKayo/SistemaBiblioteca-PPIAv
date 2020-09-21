package br.edu.fafic.ppi.resource;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import br.edu.fafic.ppi.domain.Aluno;
import br.edu.fafic.ppi.domain.Bibliotecario;
import br.edu.fafic.ppi.domain.Livro;
import br.edu.fafic.ppi.domain.Professor;
import br.edu.fafic.ppi.service.AlunoService;
import br.edu.fafic.ppi.service.BibliotecarioService;
import br.edu.fafic.ppi.service.LivroService;
import br.edu.fafic.ppi.service.ProfessorService;

@RestController
@RequestMapping(path = "/bibliotecario")
public class BibliotecarioResource {

	@Autowired
	private BibliotecarioService service;

	@Autowired
	private LivroService ls;

	@Autowired
	private AlunoService as;

	@Autowired
	private ProfessorService ps;

	@PostMapping
	public ResponseEntity<?> inserir(@RequestBody Bibliotecario bibliotecario) {
		return new ResponseEntity<>(service.inserir(bibliotecario), HttpStatus.OK);
	}

	@GetMapping(path = "/{id}")
	public ResponseEntity<?> findById(@PathVariable Long id) throws Exception {
		return new ResponseEntity<>(service.findById(id), HttpStatus.OK);
	}

	@PutMapping
	public ResponseEntity<?> update(@RequestBody Bibliotecario bibliotecario) throws Exception {
		return new ResponseEntity<>(service.update(bibliotecario), HttpStatus.OK);
	}

	@RequestMapping(value = "/livro/isbn/{isbn}", method = RequestMethod.GET)
	public ResponseEntity<Livro> findByLivroByIsbn(@PathVariable String isbn) throws Exception {
		Livro l = ls.findByIsbn(isbn);

		return ResponseEntity.ok().body(l);
	}

	@RequestMapping(value = "/livro/area/{area}", method = RequestMethod.GET)
	public ResponseEntity<Livro> findByLivroByArea(@PathVariable String area) throws Exception {
		Livro l = ls.findByArea(area);

		return ResponseEntity.ok().body(l);
	}

	@RequestMapping(value = "/livro/nome/{nome}", method = RequestMethod.GET)
	public ResponseEntity<Livro> findByLivroByNome(@PathVariable String nome) throws Exception {
		Livro l = ls.findByNome(nome);

		return ResponseEntity.ok().body(l);
	}

	@RequestMapping(value = "/livro/quant", method = RequestMethod.GET)
	public ResponseEntity<List<Livro>> findByLivroQuantDisponivel() throws Exception {

		return ResponseEntity.ok().body(ls.findByLivroQuantDisponivel());
	}
	
	
	

	@RequestMapping(value = "/aluno/nome/{nome}", method = RequestMethod.GET)
	public ResponseEntity<Aluno> findByAlunoByNome(@PathVariable String nome) throws Exception {

		Aluno a = as.findByNome(nome);

		return ResponseEntity.ok().body(a);
	}
	
	

	@RequestMapping(value = "/aluno/matricula/{matricula}",method = RequestMethod.GET)
	public ResponseEntity<Aluno> findByAlunoByMatricula(@PathVariable Integer matricula) throws Exception{
		
		Aluno a = as.findByMatricula(matricula);
		
		return ResponseEntity.ok().body(a);
	}
	
	
	

	@RequestMapping(value = "/aluno", method = RequestMethod.POST)
	public ResponseEntity<Aluno> saveAluno(@RequestBody Aluno aluno) {

		Aluno a = as.save(aluno);

		return ResponseEntity.ok().body(a);
	}

	@RequestMapping(value = "/professor/nome/{nome}", method = RequestMethod.GET)
	public ResponseEntity<Professor> findByProfessorByNome(@PathVariable String nome) throws Exception {

		Professor a = ps.findByNome(nome);

		return ResponseEntity.ok().body(a);
	}

	@RequestMapping(value = "/professor/matricula/{matricula}",method = RequestMethod.GET)
	public ResponseEntity<Professor> findByProfesorByMatricula(@PathVariable Integer matricula) throws Exception{
		
		Professor a = ps.findByMatricula(matricula);
		
		return ResponseEntity.ok().body(a);
	}

	@RequestMapping(value = "/professor", method = RequestMethod.POST)
	public ResponseEntity<Professor> saveProfessor(@RequestBody Professor professor) {

		Professor a = ps.save(professor);

		return ResponseEntity.ok().body(a);
	}

}
