package com.redsocial.servicio;

import java.util.List;

import com.redsocial.entidad.Plato;

public interface PlatoServicio {
	
	public Plato insertaActualizaPlato(Plato obj);
	public void eliminaPlato(int idPlato);
	public List<Plato> listaPlato();
	public List<Plato> listaPlatoPorNombre(String nom);
	public List<Plato> listaPlato(int idPais, String nombre);

}
