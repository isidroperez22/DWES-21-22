package org.iesalixar.servidor.controller;

import javax.servlet.http.HttpSession;

import org.iesalixar.servidor.dto.UsuarioDTO;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class LoginController {
	
	@GetMapping("/")
	public String home(Model model, HttpSession session) {
		
		UsuarioDTO usuario = new UsuarioDTO();
		
		model.addAttribute("usuario" , usuario);;
		return "index";
	}
	
	@PostMapping("/")
	public String doLogin(@ModelAttribute UsuarioDTO usuario, Model model, HttpSession session) {
		
		if(usuario.getUser().equals("usuario") && usuario.getPassword().equals("usuario")) {
			session.setAttribute("role", "usuario");
			return "redirect:/home/usuario";
		}
		
		if(usuario.getUser().equals("admin") && usuario.getPassword().equals("admin")) {
			session.setAttribute("role", "admin");
			return "redirect:/home/admin";
		}
		
		return "redirect: /";
	}
	@GetMapping("/home/usuario")
	public String loginUser(Model model, HttpSession session) {
		
		if(!session.isNew() || session.getAttribute("role").equals("usuario")) {
			session.invalidate();		
		}
		return "usuario";
	}
	
	@GetMapping("/home/admin")
	public String loginAdmin(Model model, HttpSession session) {
		if(!session.isNew() || session.getAttribute("role").equals("admin")) {
			session.invalidate();		
		}
		return "admin";
	}
}