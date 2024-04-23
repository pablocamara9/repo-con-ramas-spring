package com.salesianostriana.dam.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.salesianostriana.dam.ejemplorepoconramas.model.Persona;

@Controller
public class ControladorSaludo {
	
	@GetMapping({"/", "welcome"})
	public String welcome(@RequestParam(name = "nombre", required = false, defaultValue = "mundo") String nombre, Model model) {
		model.addAttribute("nombre", nombre);
		return "index";
	}
	
	@GetMapping("/saludo2")
	public String welcome2(Model model) {
		model.addAttribute(new Persona("Pablo", "Cámara García"));
		return "saludoPersonalizado";
	}
}
