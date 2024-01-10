package com.generation.hello_world.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("objetivos")
public class Objetivos {
	
	@GetMapping
	public String mostrarObjetivosAprendizagem() {
		return "Desenvolvimento Web c/ SpringBoot"
				+ "\nConstrução e utilização de uma API";
	}
}
