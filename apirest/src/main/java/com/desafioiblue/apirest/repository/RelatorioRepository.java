package com.desafioiblue.apirest.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.desafioiblue.apirest.models.Relatorio;

public interface RelatorioRepository extends JpaRepository<Relatorio, Long>{

	List<Relatorio> findAllByOrderByDateDesc();
	
}