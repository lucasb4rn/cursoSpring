package br.com.lucas.cursomc.config;

import java.text.ParseException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import br.com.lucas.cursomc.service.DBService;
import br.com.lucas.cursomc.service.EmailService;
import br.com.lucas.cursomc.service.MockEmailService;

@Configuration
@Profile("test")
public class TestConfig {

	@Autowired
	private DBService dbService;
	
	
	@Bean
	public boolean instanteateDataBase() throws ParseException {
		dbService.instantiateTestDataBase();
		return true;
		
	}
	
	@Bean
	public EmailService emailService() {
		return new MockEmailService();
	}
	
	
}
