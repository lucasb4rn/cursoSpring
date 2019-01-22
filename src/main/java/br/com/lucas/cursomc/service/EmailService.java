package br.com.lucas.cursomc.service;

import org.springframework.mail.SimpleMailMessage;

import br.com.lucas.cursomc.domain.Pedido;

public interface EmailService {

	void sendOrderConfirmationEmail(Pedido pedido);
	
	void sendEmail(SimpleMailMessage msg);
	
}
