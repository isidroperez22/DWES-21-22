package org.iesalixar.servidor.controller;

import java.util.Optional;

import org.iesalixar.servidor.dto.GradosDTO;
import org.iesalixar.servidor.model.Asignatura;
import org.iesalixar.servidor.model.Grado;
import org.iesalixar.servidor.services.AsignaturaServiceImpl;
import org.iesalixar.servidor.services.GradosServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/grados")
public class GradosController {
	
	@Autowired
	GradosServiceImpl gradosService;
	
	@Autowired
	AsignaturaServiceImpl asignaturaService;
	
	@GetMapping("") 
	public String grados(Model model) {
		
		model.addAttribute("grados", gradosService.getAllGrados() );
		
		return "grados";
	}
	
	@GetMapping("/asignaturas")
	public String asignaturas(@RequestParam(required=false,name="codigo") String codigo, Model model) {
		
		model.addAttribute("grados", gradosService.getAllGrados() );
		
		if (codigo==null) {
			return "redirect:/grados";
		}
		
		Optional<Asignatura> asignatura = asignaturaService.findAsignaturaById(Long.parseLong(codigo));
		model.addAttribute("asignatura",asignatura.get());
		return "gradosAsignaturas";
	}
	
	@GetMapping("/grado/addGrado")
	public String addGradoGet(@RequestParam(required = false, name = "error") String error,
			@RequestParam(required = false, name = "grado") String nombre, Model model) {

		GradosDTO gradodto = new GradosDTO();

		model.addAttribute("gradodto", gradodto);
		model.addAttribute("error", error);
		model.addAttribute("previo", nombre);
		return "addGrado";
	}

	@PostMapping("/grado/addGrado")
	public String addGradoPost(@ModelAttribute GradosDTO gradoDTO, Model model) {

		Grado gradoBD = new Grado();
		gradoBD.setNombre(gradoDTO.getNombre());

		if (gradosService.insertarGrado(gradoBD) == null) {
			return "redirect:/grado/addGrado?error=Existe&grado=" + gradoDTO.getNombre();
		}

		return "redirect:/grado";
	}
	
}
