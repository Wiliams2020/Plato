package com.redsocial.controlador;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.redsocial.entidad.Plato;
import com.redsocial.servicio.PlatoServicio;

@Controller
public class PlatoCrudController {
	
	@Autowired
	private PlatoServicio servicio;
	
	@RequestMapping("/verCrudPlato")
	public String ver() {
		return "crudPlato";
	}
	
	@RequestMapping("/consultaCrudPlato")
	public String lista(String filtro, Model m) {
		List<Plato> lista =  servicio.listaPlatoPorNombre(filtro+"%");
		m.addAttribute("platos", lista);
		return "crudPlato";
	}
	
	@RequestMapping("/registraActualizaCrudPlato")
	public String registraActualiza(Plato obj, Model m) {
		servicio.insertaActualizaPlato(obj);
		List<Plato> lista =  servicio.listaPlato();
		m.addAttribute("platos", lista);
		return "crudPlato";
	}
	
	@RequestMapping("/eliminaCrudPlato")
	public String elimina(int id, Model m) {
		servicio.eliminaPlato(id);
		List<Plato> lista =  servicio.listaPlato();
		m.addAttribute("platos", lista);
		return "crudPlato";
	}

}
