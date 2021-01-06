package org.primeiro.web.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class PrimeiroController {
	
	
	@RequestMapping("/")
	public String index(){
	    System.out.println("Entrou no meu Controller");
	    return "home";
	}

}
