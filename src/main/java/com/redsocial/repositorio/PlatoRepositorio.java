package com.redsocial.repositorio;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.redsocial.entidad.Plato;


public interface PlatoRepositorio  extends JpaRepository <Plato, Integer>{
	
	@Query("select p from Plato p where p.nombre like :param")
	public abstract List<Plato> buscaPorNombre(@Param("param")String filtro);
	
	@Query("select p from Plato p where p.pais.idPais= :p1 and p.nombre like :p2")                                 
	public abstract List<Plato> listaPlato(@Param("p1")int idPais, @Param("p2")String nombre);

}
