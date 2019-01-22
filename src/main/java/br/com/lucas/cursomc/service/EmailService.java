package br.com.lucas.cursomc.service;

import javax.mail.internet.MimeMessage;

import org.springframework.mail.MailMessage;
import org.springframework.mail.SimpleMailMessage;

import br.com.lucas.cursomc.domain.Pedido;

public interface EmailService {

	void sendOrderConfirmationEmail(Pedido pedido);
	
	void sendEmail(SimpleMailMessage msg);
	
	void sendOrderConfirmationHtmlEmail(Pedido obj);
	
	void sendHtmlEmail(MimeMessage msg);
	
}
