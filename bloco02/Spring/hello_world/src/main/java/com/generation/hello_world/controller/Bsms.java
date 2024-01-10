package com.generation.hello_world.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("bsms")
public class Bsms {
	
	@GetMapping
	public String mostrarBsms() {
		return 	  "Responsabilidade Pessoal, "
				+ "\nMentalidade de Crescimento, "
				+ "\nOrientação ao Futuro, "
				+ "\nPersistência, "
				+ "\nComunicação, "
				+ "\nAtenção aos Detalhes, "
				+ "\nTrabalho em Equipe, "
				+ "\nProatividade ";
	}
}
