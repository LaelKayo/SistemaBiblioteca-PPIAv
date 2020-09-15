package br.edu.fafic.ppi.resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.edu.fafic.ppi.service.ProfessorService;

@RestController
@RequestMapping(value = "/professor")
public class ProfessorResource {

	@Autowired
	private ProfessorService ps;
}
