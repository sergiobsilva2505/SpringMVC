package br.com.sbs.estacionamento.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import br.com.sbs.estacionamento.entities.Veiculo;

@Controller
@RequestMapping("/veiculos")
public class VeiculoController {
	
//	@GetMapping
//	public List<Veiculo> findAll(HttpServletRequest requisiçao) {
//		List<Veiculo> lista = veiculoService.findAll();
//
//		return "index";
//
//	}
	
	@GetMapping("/index")
	public String showForm() {
		return "index";
	}

}
