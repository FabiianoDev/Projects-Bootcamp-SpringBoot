package com.segundaapli.activityTwo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/activityTwo")
	public class Hello2Controller {
	
	@GetMapping
	public String hello( ) {
		return "Meus objetivos de aprendizagem é manter a persistência e focar no conteúdo, "
				+ "o conteúdo está se desenvolvendo muito rápido mas aos poucos estou aprendendo";
	}

}
