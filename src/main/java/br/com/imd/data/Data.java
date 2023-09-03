package br.com.imd.data;

import java.util.Date;

import br.com.imd.domain.Papel;
import br.com.imd.repositories.PapelRepository;

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
	}

}
