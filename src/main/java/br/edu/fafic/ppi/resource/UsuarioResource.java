package br.edu.fafic.ppi.resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.edu.fafic.ppi.service.UsuarioService;

@RestController
@RequestMapping("/Usuario")
public class UsuarioResource {

	@Autowired
	private UsuarioService usuarioService;
	
	@GetMapping("/login/{matricula}/{senha}")
	public ResponseEntity logByMatriculaSenha(@PathVariable("matricula")int matricula, @PathVariable("senha")String senha) throws Exception {
		
		return ResponseEntity.ok().body(usuarioService.loginUsuario(matricula, senha));
	}
}
