package br.com.imd.controllers;

import java.util.Date;
import java.util.List;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.imd.domain.Papel;
import br.com.imd.repositories.PapelRepository;
import br.com.imd.util.PapelUtil;

@CrossOrigin
@RestController
public class PapelController {

	@RequestMapping("/papeis")
	public List<Papel> getPapeis() {
		return PapelRepository.getPapeis();
	}
	
	@PostMapping("/papeis")
	public Papel addPapel(@RequestBody Papel papel) {
		papel.setDescricao(papel.getDescricao());
		papel.setDataCadastro(new Date());
		papel.setId(PapelUtil.getNextId());
		return PapelRepository.addPapel(papel);
	}
}
