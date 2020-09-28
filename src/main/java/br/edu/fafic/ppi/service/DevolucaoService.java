package br.edu.fafic.ppi.service;

import java.util.Date;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.edu.fafic.ppi.domain.Devolucao;
import br.edu.fafic.ppi.domain.Emprestimo;
import br.edu.fafic.ppi.repository.DevolucaoRepository;

@Service
public class DevolucaoService {

	
	@Autowired
	DevolucaoRepository dr;
	
	
	public Devolucao save(Devolucao dev) {
		
		Devolucao d = dr.save(dev);
		
		return d;
	}
	
	
	public Devolucao findByDevolucaoByNome (String nome) throws Exception {
		
		Optional<Devolucao> d = dr.findByDevolucaoByName(nome);
		
		return d.orElseThrow(()-> new Exception("Erro ao buscar Devolucao"));
	}
	
	public void deletById(Long id ) {
		
		dr.deleteById(id);
		
	}
	
	public Devolucao findyByCalculoAtraso(Devolucao devolucao, Emprestimo emprestimo) {
		
	Date dia = new Date();
	
	
		
		return null;
	}
}
