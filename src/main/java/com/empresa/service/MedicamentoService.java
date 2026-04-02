package com.empresa.service;

import java.util.List;

import com.empresa.entity.Medicamento;

public interface MedicamentoService {

	public List<Medicamento> listaMedicamentoPorNombre(String nombre);
	
	public List<Medicamento> listaMedicamentoPorStock(int stockMin, int stockMax);
}
