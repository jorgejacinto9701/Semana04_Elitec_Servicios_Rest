package com.empresa.service;

import java.util.List;

import com.empresa.entity.Proveedor;

public interface ProveedorService {
	
	public abstract Proveedor insertaProveedor(Proveedor objProveedor);
	public abstract Proveedor actualizaProveedor(Proveedor objProveedor);
	public abstract void eliminaProveedor(int idProveedor);
	public abstract Proveedor buscaProveedor(int idProveedor);
	public abstract List<Proveedor> listaTodos();
	public abstract List<Proveedor> listaPorNombre(String nombre);
	

}
