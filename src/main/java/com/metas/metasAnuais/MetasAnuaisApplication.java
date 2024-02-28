package com.metas.metasAnuais;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
@SpringBootApplication
public class MetasAnuaisApplication {

	@GetMapping
	public String getMetas(){return "Teste ok!";}

	public static void main(String[] args) {
		SpringApplication.run(MetasAnuaisApplication.class, args);
	}

}
