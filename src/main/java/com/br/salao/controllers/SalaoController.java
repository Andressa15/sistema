package com.br.salao.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import com.br.salao.services.SalaoService;

@Controller
public class SalaoController {

	@Autowired
	private SalaoService salaoService;

	@GetMapping("/exibir")
	public ModelAndView mostrar1() {
		ModelAndView modelAndView = new ModelAndView("exibir.html");
		modelAndView.addObject("salao", salaoService.pegarTodosUsuarios());
		return modelAndView;
	}

	@GetMapping("/cliente")
	public ModelAndView cadasCliente() {
		ModelAndView modelAndView = new ModelAndView("cliente.html");
		return modelAndView;
	}

	@GetMapping("/postagem/{id}")
	public ModelAndView procurarPOstagem(@PathVariable Integer id) {
		ModelAndView modelAndView = new ModelAndView("unica.html");
		modelAndView.addObject("postagem", salaoService.procurarPostagem(id));
		return modelAndView;
	}
	@PostMapping("/exibir")
	public ModelAndView mostrar() {
		ModelAndView modelAndView = new ModelAndView("exibir.html");
		return modelAndView;
	}
}