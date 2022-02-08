package org.iesalixar.servidor.controller;

import java.util.ArrayList;
import java.util.List;

import org.iesalixar.servidor.dto.ConciertoDTO;
import org.iesalixar.servidor.dto.MatriculaDTO;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
@RequestMapping("/")
public class FormController {
	
	@GetMapping("/matricula")
	public String formMatricula(Model model) {
		
		List<String> curso = new ArrayList<>();
		List<String> materias = new ArrayList<>();
		
		curso.add("DAW 2");
		curso.add("DAW 1");
		
		materias.add("DAW");
		materias.add("DIW");
		materias.add("DWEC");
		materias.add("DWES");
		materias.add("EINEM");
		
		MatriculaDTO matricula = new MatriculaDTO();	
		
		model.addAttribute("matricula", matricula);
		model.addAttribute("cursos", curso);
		model.addAttribute("materias", materias);
		return "forms/matricula";
		
	}
	
	@PostMapping("/matricula")
	public String formMatriculaPost(@ModelAttribute MatriculaDTO matricula, Model model) {
		
		model.addAttribute("matricula", matricula);
		return "forms/matricula";
	}
	
	@GetMapping("/concierto")
	public String formConcierto(Model model) {
		
		ConciertoDTO matricula = new ConciertoDTO();	
		
		model.addAttribute("matricula", matricula);
		return "forms/concierto";
		
	}
	
	@PostMapping("/concierto")
	public String formConciertoPost(@ModelAttribute MatriculaDTO matricula, Model model) {
		
		model.addAttribute("matricula", matricula);
		return "forms/concierto";
	}
}
