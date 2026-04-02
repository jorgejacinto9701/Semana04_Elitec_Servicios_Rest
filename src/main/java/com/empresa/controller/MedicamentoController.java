package com.empresa.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.empresa.entity.Medicamento;
import com.empresa.service.MedicamentoServicelmpl;


@RestController
@RequestMapping("/rest/medicamento")
public class MedicamentoController {
	
	@Autowired
	private MedicamentoServicelmpl medicamentoService;

	
	@GetMapping("/listaMedicamentoPorNombre/{filtro}")
	public List<Medicamento> listaMedicamentoPorNombre(@PathVariable String filtro) {
		return medicamentoService.listaMedicamentoPorNombre(filtro);
	}
	
	@GetMapping("/listaPorStock")
	public List<Medicamento> listaMedicamentoPorStock(@RequestParam int desde, @RequestParam int hasta) {
		return medicamentoService.listaMedicamentoPorStock(desde, hasta);
	}

}
