package org.iesalixar.servidor.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class headerController {
	@RequestMapping("/")
	public String inicio(Model model) {
		model.addAttribute("contenido","INICIO");
		return "index";
	}
	@RequestMapping("/services")
	public String servicios(
			@RequestParam(name = "online", required = false,  defaultValue = "Online") String online,
			@RequestParam(name = "domicilio", required = false,  defaultValue = "A domicilio") String casa,
			Model model) {
	
		model.addAttribute("contenido","SERVICIOS");
		model.addAttribute("online",online);
		model.addAttribute("domicilio", casa);
		return "servicios";
	}
	
	@RequestMapping("/products")
	public String productos(
			@RequestParam(name = "name", required = false,  defaultValue = "Cafe") String name,
			@RequestParam(name = "brand", required = false,  defaultValue = "Saimaza") String brand,
			@RequestParam(name = "category", required = false,  defaultValue = "Colombia") String category,
			Model model) {
		model.addAttribute("contenido","PRODUCTOS");
		model.addAttribute("producto", name);
		model.addAttribute("brand", brand);
		model.addAttribute("category",category);
		return "productos";
	}
	
	@RequestMapping("/about")
	public String about(Model model) {
		model.addAttribute("contenido","ABOUT");
		return "about";
	}
}
