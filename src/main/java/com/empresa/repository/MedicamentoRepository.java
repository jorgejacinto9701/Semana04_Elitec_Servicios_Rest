package com.empresa.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.empresa.entity.Medicamento;

public interface MedicamentoRepository extends JpaRepository<Medicamento, Integer> {

	@Query("SELECT m FROM Medicamento m WHERE m.nombre LIKE %:nombre%")
	public List<Medicamento> listaPoNombre(String nombre);
	
	public List<Medicamento> findByStockBetween(int stockMin, int stockMax);
	
	
}
	
