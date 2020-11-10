package br.edu.fafic.ppi.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.edu.fafic.ppi.domain.Usuario;
import br.edu.fafic.ppi.repository.UsuarioRepository;

@Service
public class UsuarioService {

	@Autowired
	private UsuarioRepository usuarioRepository;
	
	
	public Usuario loginUsuario(int matricula, String senha) throws Exception{
	    Optional<Usuario> u = usuarioRepository.autenticacao(matricula, senha);
	    
	    return u.orElseThrow(()-> new Exception("Matricula ou Senha inválidos"));
	    
	}
}
