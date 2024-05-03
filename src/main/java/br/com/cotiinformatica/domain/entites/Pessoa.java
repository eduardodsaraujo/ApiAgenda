package br.com.cotiinformatica.domain.entites;

import java.util.UUID;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;

@Data
@Document("Pessoa")
public class Pessoa {
	
	@Id
	private UUID id;
	private String nome;
	private String email;
	private String senha;
	
	
	
}
