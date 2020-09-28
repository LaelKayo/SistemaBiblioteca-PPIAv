package br.edu.fafic.ppi.resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import br.edu.fafic.ppi.domain.Emprestimo;
import br.edu.fafic.ppi.service.EmprestimoService;


@RestController
@RequestMapping(value = "/emprestimo")
public class EmprestimoResource {
	
	@Autowired
	EmprestimoService es;
	
	
	@RequestMapping(method = RequestMethod.POST)
	public ResponseEntity<Emprestimo> saveMovimentacao(@RequestBody Emprestimo emp){
		
		
		Emprestimo e = es.save(emp);
		
		return ResponseEntity.ok().body(e);
	}
	
	
	@RequestMapping(value = "/id/{id}",method = RequestMethod.GET)
	public ResponseEntity<Emprestimo> findById(@PathVariable Long id) throws Exception{
		
		Emprestimo e = es.findById(id);
		
		return ResponseEntity.ok().body(e);
	}
	
	@RequestMapping(value = "/update",method = RequestMethod.PUT)
	public ResponseEntity<Emprestimo> updateMovimentacao(@RequestBody Emprestimo emp){
		
		
		Emprestimo e = es.save(emp);
		
		return ResponseEntity.ok().body(e);
	}
	
	@RequestMapping(value = "/{nome}", method = RequestMethod.GET)
	public ResponseEntity<Emprestimo> findByEmprestimoAluno(@PathVariable String nome) throws Exception{
		Emprestimo e = es.findByEmprestimoAluno(nome);
		
		
		return ResponseEntity.ok().body(e);
		
	}
	
	
	@RequestMapping(value = "delete/{id}", method = RequestMethod.DELETE)
	public ResponseEntity<Emprestimo> deleteById(@PathVariable Long id) {
		es.deletById(id);
		
		
		return ResponseEntity.ok().build();
		
	}
	
	
	
	
	
	
	
	
 	

}
