package com.redsocial.controlador;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.redsocial.entidad.Plato;
import com.redsocial.servicio.PlatoServicio;



@Controller
public class PlatoConsultaController {

	@Autowired
	private PlatoServicio servicio;
	
	@RequestMapping("/verConsultaPlato")
	public String ver() {
		return "consultaPlato";
	}
	
	@RequestMapping("/consultaPlato")
	public String lista(int idPais, String nombre, Model m) {
		List<Plato> lista =  servicio.listaPlato(idPais, nombre+"%");
		m.addAttribute("platos", lista);
		return "consultaPlato";
	}
	
	
	
}
