package br.edu.fafic.ppi.resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import br.edu.fafic.ppi.domain.Devolucao;
import br.edu.fafic.ppi.service.DevolucaoService;

@RestController
@RequestMapping(value = "/devolucao")
public class DevolucaoResource {
	
	@Autowired
	DevolucaoService ds;
	
	@RequestMapping(method = RequestMethod.POST)
	public ResponseEntity<Devolucao> save(@RequestBody Devolucao dev){
		
		Devolucao d = ds.save(dev);
		
		
		return ResponseEntity.ok().body(d);
		
	}
	
	@RequestMapping(value = "/update",method = RequestMethod.PUT)
	public ResponseEntity<Devolucao> update(@RequestBody Devolucao dev){
		
		Devolucao d = ds.findyByCalculoAtraso(dev);
				
		ds.save(dev);
		
		
		return ResponseEntity.ok().body(d);
		
	}
	
	
	@RequestMapping(value = "/{nome}", method = RequestMethod.GET)
	public ResponseEntity<Devolucao> findByDevolucaoByid(@PathVariable String nome) throws Exception{
		
		Devolucao d = ds.findByDevolucaoByNome(nome);
		
		return ResponseEntity.ok().body(d);
	}
	
	@RequestMapping(value = "/delete/{id}", method = RequestMethod.DELETE)
	public ResponseEntity<Devolucao> deleteById(@PathVariable Long id){
		
		ds.deletById(id);
		
		return ResponseEntity.ok().build();
	}

}
