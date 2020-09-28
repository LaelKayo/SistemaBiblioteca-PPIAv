package br.edu.fafic.ppi.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.edu.fafic.ppi.domain.Emprestimo;
import br.edu.fafic.ppi.repository.EmprestimoRepository;


@Service
public class EmprestimoService {

	
	
	@Autowired
	private EmprestimoRepository er;
	
	
	
	
	public Emprestimo save(Emprestimo mov) {
		Emprestimo a = er.save(mov);
		
		return a;
		
	}
	
	public Emprestimo findById(Long id) throws Exception{
		
		Optional<Emprestimo> m = er.findById(id);
		
		return m.orElseThrow(()-> new Exception("Erro ao consultar a movimentacao"));
	}
	
	public Emprestimo findByEmprestimoAluno(String nome) throws Exception {
		Optional<Emprestimo> m = er.findByEmprestimoAluno(nome);
		
		return m.orElseThrow(() -> new Exception("Erro"));
	}
	
	
	public void deletById(Long id) {
		er.deleteById(id);
	}
	
	
	
}
