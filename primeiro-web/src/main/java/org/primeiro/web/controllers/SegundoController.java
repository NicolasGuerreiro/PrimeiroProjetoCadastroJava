package org.primeiro.web.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class SegundoController {
	
	
	@RequestMapping("/login")
	public String teste() {
		System.out.println("Entrou no Controller de Login");
		return "login";
	}

}
