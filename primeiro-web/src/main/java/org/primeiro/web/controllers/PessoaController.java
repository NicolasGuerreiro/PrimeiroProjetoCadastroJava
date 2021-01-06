package org.primeiro.web.controllers;

import java.util.List;

import org.primeiro.web.dao.PessoaDAO;
import org.primeiro.web.model.Pessoa;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class PessoaController {
	
	@RequestMapping("/cadastroForm")
	public String abrirFormulario() {
		return "cadastroForm";
	}
	
	@RequestMapping("/cadastroPessoa")
	public ModelAndView cadastrar(Pessoa p) {
		PessoaDAO.insertPessoa(p);
		System.out.println("Quantidade de Cadastros "+PessoaDAO.getAll().size());
		return new ModelAndView("redirect:pessoas");
	}
	
	@RequestMapping(value = "/pessoas", method = RequestMethod.GET)
	public ModelAndView listarPessoas() {
		List<Pessoa> pessoas = PessoaDAO.getAll();
		ModelAndView modelandView = new ModelAndView("listaPessoa");
		modelandView.addObject("pessoas", pessoas);
		return modelandView;
	}
	

}
