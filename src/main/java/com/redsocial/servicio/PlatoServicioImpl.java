package com.redsocial.servicio;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.redsocial.entidad.Plato;
import com.redsocial.repositorio.PlatoRepositorio;
@Service
public class PlatoServicioImpl implements PlatoServicio{
	
	@Autowired
	private PlatoRepositorio repositorio;

	@Override
	public Plato insertaActualizaPlato(Plato obj) {
		return repositorio.save(obj);
	}

	@Override
	public void eliminaPlato(int idPlato) {
		repositorio.deleteById(idPlato);
		
	}

	@Override
	public List<Plato> listaPlato() {
		return repositorio.findAll();
	}

	@Override
	public List<Plato> listaPlatoPorNombre(String nom) {
		return repositorio.buscaPorNombre(nom);
	}

	@Override
	public List<Plato> listaPlato(int idPais, String nombre) {
		return repositorio.listaPlato(idPais, nombre);
	}


	

}
