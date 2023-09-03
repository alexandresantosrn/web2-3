package br.com.imd.data;

import java.util.Arrays;
import java.util.Date;

import br.com.imd.domain.Papel;
import br.com.imd.domain.Usuario;
import br.com.imd.repositories.PapelRepository;
import br.com.imd.repositories.UsuarioRepository;

public class Data {
	
	public static void carregarDados() {
		
		Papel papel1 = new Papel();
		Papel papel2 = new Papel();
		Papel papel3 = new Papel();
		
		papel1.setId(1);
		papel2.setId(2);
		papel3.setId(3);
		
		papel1.setDataCadastro(new Date());
		papel2.setDataCadastro(new Date());
		papel3.setDataCadastro(new Date());
		
		papel1.setDescricao("Administrador Financeiro");
		papel2.setDescricao("Gestor Financeiro");
		papel3.setDescricao("Usuário Financeiro");
		
		PapelRepository.addPapel(papel1);
		PapelRepository.addPapel(papel2);
		PapelRepository.addPapel(papel3);				
		
		Usuario usuario1 = new Usuario();
		Usuario usuario2 = new Usuario();
		Usuario usuario3 = new Usuario();
		
		usuario1.setId(1);
		usuario2.setId(2);
		usuario3.setId(3);
		
		usuario1.setDataCadastro(new Date());
		usuario2.setDataCadastro(new Date());
		usuario3.setDataCadastro(new Date());			
		
		usuario1.setNome("Ronaldo Nazário");
		usuario2.setNome("Romário Faria");
		usuario3.setNome("Neymar Jr.");
		
		usuario1.setPapeis(Arrays.asList(papel1));
		usuario2.setPapeis(Arrays.asList(papel2));
		usuario1.setPapeis(Arrays.asList(papel3));	

		UsuarioRepository.addUsuario(usuario1);
		UsuarioRepository.addUsuario(usuario2);
		UsuarioRepository.addUsuario(usuario3);	
	}

}
