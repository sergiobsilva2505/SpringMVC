package br.com.sbs.estacionamento.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import br.com.sbs.estacionamento.entities.Veiculo;
import br.com.sbs.estacionamento.service.VeiculoService;

@Controller
@RequestMapping("/veiculos")
public class VeiculoController {

	@Autowired
	private VeiculoService veiculoService;
	
	@RequestMapping("novoVeiculo")
	public String form() {
		return "veiculo/formVeiculo";
	}

	@GetMapping("/listaVeiculos")
	public ModelAndView lista() {
		ModelAndView model = new ModelAndView("listaVeiculos");
		List<Veiculo> veiculos = veiculoService.findAll();
		model.addObject("veiculos",veiculos);
		return model;
	}

	@GetMapping()
	public String showForm() {
		return "index";
	}

}
