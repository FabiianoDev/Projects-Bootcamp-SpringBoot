package com.primeiraapli.activityOne.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
	public class HelloController {
	
	@GetMapping
	public String hello( ) {
		return "A habilidade que utilizei para desenvolver esta"
				+ "primeira atividade foi: Orientação aos detalhes e a mentalidade em que trabalhei foi: Persistência ";
	}

}
