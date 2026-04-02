package com.empresa.service;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.empresa.entity.Medicamento;
import com.empresa.repository.MedicamentoRepository;

@Service
public class MedicamentoServicelmpl implements MedicamentoService {
		
	@Autowired
	private MedicamentoRepository medicamentoRepository;
	

	@Override
	public List<Medicamento> listaMedicamentoPorNombre(String nombre) {
		return medicamentoRepository.listaPoNombre(nombre);
	}


	@Override
	public List<Medicamento> listaMedicamentoPorStock(int stockMin, int stockMax) {
		return medicamentoRepository.findByStockBetween(stockMin, stockMax);
	}
	
	
}
