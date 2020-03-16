package com.desafioiblue.apirest.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.desafioiblue.apirest.models.Relatorio;
import com.desafioiblue.apirest.repository.RelatorioRepository;

@RestController
@RequestMapping(value="/api")
@CrossOrigin(origins="*")
public class RelatorioResource {

	@Autowired
	RelatorioRepository relatorioRepository;
		
	// Método GET que recebe todos os objetos
	// do meu db.
	@GetMapping("/relatorio")
	public List<Relatorio> listaRelatorio(){
		return relatorioRepository.findAllByOrderByDateDesc();
	}
	
	// Método POST que irá enviar os dados da
	// pesquisa realizada para o meu db.
	@PostMapping("/relatorio")
	public Relatorio salvaPesquisa(@RequestBody Relatorio relatorio) {
		return relatorioRepository.save(relatorio);
	}
}
