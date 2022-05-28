package com.algaworks.algafood.di.notificacao;

import org.springframework.stereotype.Component;
import com.algaworks.algafood.di.modelo.Cliente;

public class NotificadorEmail implements Notificador {

	private boolean caixaAlta;
	private String hostServidorSmtp;
	
	//CONSTRUTOR DA CLASSE
	public NotificadorEmail(String hotServidorSmtp) {
		this.hostServidorSmtp = hotServidorSmtp;
		System.out.println("NotificadorEmail ");
	}

	@Override //SOBRESCREVE O METODO DA INTERFACE
	public void notificar(Cliente cliente, String mensagem) {
		if (this.caixaAlta) {
			mensagem = mensagem.toUpperCase();
		}

		System.out.printf("Notificando %s atraves do e-mail %s: usando SMTP %s: %s\n", 
				cliente.getNome(), 
				cliente.getEmail(),
				this.hostServidorSmtp, 
				mensagem);
	}

	public void setCaixaAlta(boolean caixaAlta) {
		this.caixaAlta = caixaAlta;
	}

}
