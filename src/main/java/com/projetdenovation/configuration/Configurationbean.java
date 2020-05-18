package com.projetdenovation.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;

import com.projetdenovation.service.Servicee;
import com.projetdenovation.repository.Etudientrepository;

@Configuration
public class Configurationbean {
	
	@Bean
	public Etudientrepository etutientrepository() {
		return new Etudientrepository();
	}
	@Bean
	public Servicee servicee() {
		return new Servicee(etutientrepository());
	}
		
	
	

}
