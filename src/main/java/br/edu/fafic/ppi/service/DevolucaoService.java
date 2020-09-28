package br.edu.fafic.ppi.service;

import java.time.ZoneId;
import java.time.temporal.ChronoUnit;
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
	
		
	public boolean findyByCalculoAtraso(Devolucao devolucao, Emprestimo emprestimo) {
		double multa = devolucao.getMulta();
				
		long diasAtrasados = ChronoUnit.DAYS.between(devolucao.getDataDevolucao().toInstant().atZone(ZoneId.systemDefault()).toLocalDateTime(), 
				emprestimo.getDataEmprestimo().toInstant().atZone(ZoneId.systemDefault()).toLocalDateTime());

		if(diasAtrasados > 3) {
			diasAtrasados -= 3;
			multa = diasAtrasados * 2;
		}
		
		devolucao.setMulta(multa);
		
//		double totalMulta = multa;

		return true;
	}
}
