package com.redsocial.controlador;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.redsocial.entidad.Pais;
import com.redsocial.entidad.Plato;
import com.redsocial.servicio.PaisServicio;
import com.redsocial.servicio.PlatoServicio;



@Controller
public class PlatoController {

	@Autowired
	private PlatoServicio platoServicio;
	
	@Autowired
	private PaisServicio paisServicio;

	@RequestMapping("/verPlato")
	public String ver() {
		return "registraPlato";
	}
	
	@RequestMapping("/cargaPais")
	@ResponseBody
	public List<Pais> listaPais() {
		return paisServicio.listaPais();
	}
	
	@RequestMapping("/registraPlato")
	public String metRegistra(Plato obj,HttpSession session) {
		Plato aux = platoServicio.insertaActualizaPlato(obj);
		if(aux == null) {
			session.setAttribute("MENSAJE", "Registro erróneo");
		}else {
			session.setAttribute("MENSAJE", "Registro exitos");
		}
		return "redirect:verPlato";
	}


	
	
}
