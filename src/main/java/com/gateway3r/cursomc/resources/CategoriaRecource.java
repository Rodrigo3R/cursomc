package com.gateway3r.cursomc.resources;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value="/categorias")
public class CategoriaRecource {
	
	@RequestMapping(method=RequestMethod.GET)
	public String listar() {
		return "Rest esta funcionando";
	}

}
