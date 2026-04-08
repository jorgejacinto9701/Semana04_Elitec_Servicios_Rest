package com.empresa.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.empresa.entity.Proveedor;
import com.empresa.repository.ProveedorRepository;

@Service
public class ProveedorServiceImpl implements ProveedorService {
	
	@Autowired
	private ProveedorRepository proveedorRepository;

	@Override
	public Proveedor insertaProveedor(Proveedor objProveedor) {
		return proveedorRepository.save(objProveedor);
	}

	@Override
	public Proveedor actualizaProveedor(Proveedor objProveedor) {
		return proveedorRepository.save(objProveedor);
	}

	@Override
	public void eliminaProveedor(int idProveedor) {
		proveedorRepository.deleteById(idProveedor);
	}

	@Override
	public Proveedor buscaProveedor(int idProveedor) {
		return proveedorRepository.findById(idProveedor).orElse(null);
	}

	@Override
	public List<Proveedor> listaTodos() {
		return proveedorRepository.findAll();
	}

	@Override
	public List<Proveedor> listaPorNombre(String nombre) {
		return proveedorRepository.findByNombreContaining(nombre);
	}
	
	

}
