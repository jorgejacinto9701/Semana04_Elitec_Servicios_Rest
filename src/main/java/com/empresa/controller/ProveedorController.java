package com.empresa.controller;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.empresa.entity.Proveedor;
import com.empresa.service.ProveedorService;

@RestController
@RequestMapping("/rest/proveedor")
public class ProveedorController {

	@Autowired
	private ProveedorService proveedorService;
	
	@PostMapping
	@ResponseBody
	public ResponseEntity<?> insertaProveedor(@RequestBody Proveedor objProveedor){
		HashMap<String, Object> salida = new HashMap<>();
		objProveedor.setIdProveedor(0);
		objProveedor.setFechaActualizacion(LocalDateTime.now());
		objProveedor.setFechaRegistro(LocalDateTime.now());
		objProveedor.setEstado(1);
		Proveedor objSalida = proveedorService.insertaProveedor(objProveedor);
		salida.put("mensaje", "Proveedor registrado");
		salida.put("data", objSalida);
		return ResponseEntity.ok(salida);
	}
	
	@PutMapping
	@ResponseBody
	public ResponseEntity<?> actualizaProveedor(@RequestBody Proveedor objProveedor){
		HashMap<String, Object> salida = new HashMap<>();
		objProveedor.setFechaActualizacion(LocalDateTime.now());
		Proveedor objSalida = proveedorService.insertaProveedor(objProveedor);
		salida.put("mensaje", "Proveedor actualizado");
	    salida.put("data", objSalida);
		return ResponseEntity.ok(salida);
	}
	
	@DeleteMapping("/{id}")
	public ResponseEntity<?> eliminaProveedor(@PathVariable int id){
		HashMap<String, Object> salida = new HashMap<>();
        proveedorService.eliminaProveedor(id);
        salida.put("mensaje", "Proveedor eliminado");
		return ResponseEntity.ok(salida);
	}
	
	@GetMapping
	public List<Proveedor> listaTodos() {
		return proveedorService.listaTodos();
	}
	
	@GetMapping("/listaPorNombre/{filtro}")
	public List<Proveedor> listaPorNombre(@PathVariable String filtro) {
		return proveedorService.listaPorNombre(filtro);
	}
	
}






