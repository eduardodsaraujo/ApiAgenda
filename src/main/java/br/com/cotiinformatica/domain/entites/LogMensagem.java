package br.com.cotiinformatica.domain.entites;

import java.time.LocalTime;
import java.util.UUID;

import org.springframework.data.annotation.Id;

import lombok.Data;

@Data
public class LogMensagem {
	
	@Id
	private UUID id;
	private String status;
	private LocalTime dataHora;
	private String mensagem;
	private String erro;
}
