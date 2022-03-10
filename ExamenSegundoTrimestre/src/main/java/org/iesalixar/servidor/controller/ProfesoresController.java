package org.iesalixar.servidor.controller;

import java.util.List;
import java.util.Optional;

import org.iesalixar.servidor.model.Profesor;
import org.iesalixar.servidor.services.ProfesorServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller

public class ProfesoresController {
	
	@Autowired
	ProfesorServiceImpl profService;
	
	
	@RequestMapping("/profesores")
	public String profesores(Model model) {
		
		List<Profesor> profesor = profService.getAllProfesores();
		
		model.addAttribute("profesor", profesor);
		return "profesores";
	}
	
	@GetMapping("profesores/asignaturas")
	public String profesoresAsignaturas(@RequestParam(required=false,name="codigo") String codigo,Model model) {
		
		if (codigo==null) {
			return "redirect:/asignaturas";
		}
		
		model.addAttribute("asignatura", profService.findProfesorById(Long.parseLong(codigo)));
		return "profesoresAsignaturas";
	}
}
