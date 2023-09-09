package br.com.imd.controllers;

import java.util.Date;
import java.util.List;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.imd.domain.Usuario;
import br.com.imd.repositories.UsuarioRepository;

import br.com.imd.util.UsuarioUtil;

@CrossOrigin
@RestController
public class UsuarioController {
	
	@RequestMapping("/usuarios")
	public List<Usuario> getUsuarios() {
		return UsuarioRepository.getUsuarios();
	}
	
	@PostMapping("/usuarios")
	public Usuario addUsuario(@RequestBody Usuario usuario) {	
		usuario.setDataCadastro(new Date());
		usuario.setId(UsuarioUtil.getNextId());
		return UsuarioRepository.addUsuario(usuario);
	}
}
