package org.iesalixar.servidor.controller;

import org.iesalixar.servidor.dto.MatriculaDTO;
import org.iesalixar.servidor.dto.RegistroDTO;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
@RequestMapping("/forms")
public class FormController {
	
	@GetMapping("/matricula")
	public String formMatricula(Model model) {
		MatriculaDTO matricula = new MatriculaDTO();		
		model.addAttribute("matricula", matricula);
		return "forms/matricula";
		
	}
	
	@PostMapping("/matricula")
	public String formMatriculaPost(@ModelAttribute MatriculaDTO matricula, Model model) {
		model.addAttribute("matricula", matricula);
		return "forms/matricula";
	}
	
	@GetMapping("/registro")
	public String formRegistro(Model model) {
		RegistroDTO registro = new RegistroDTO();		
		model.addAttribute("registro", registro);
		return "forms/registro";
		
	}
	
	@PostMapping("/regsitro")
	public String formRegistroPost(@ModelAttribute RegistroDTO registro, Model model) {
		model.addAttribute("registro", registro);
		return "forms/registro";
		
	}
}
