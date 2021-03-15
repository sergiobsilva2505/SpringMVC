package br.com.sbs.estacionamento.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/index")
public class VeiculoController {
	
	@GetMapping
	public String hello(HttpServletRequest requisição) {
		 
		return "index";
		
	}

}
