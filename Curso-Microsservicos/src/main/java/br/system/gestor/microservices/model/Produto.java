package br.system.gestor.microservices.model;

import java.time.LocalDateTime;
import java.util.UUID;

import com.fasterxml.jackson.annotation.JsonFormat;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Produto {

	/* Pesquisar sobre o lombok suas anotações e metodos! */
	private UUID id = UUID.randomUUID();
	private String nome;
	private Double valor;
	private br.system.gestor.microservices.enums.Status status;

	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss") /* Boa pratica adicionar essa anotação! */
	private LocalDateTime dataHora;

}
