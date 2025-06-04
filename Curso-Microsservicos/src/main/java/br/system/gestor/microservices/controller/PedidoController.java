package br.system.gestor.microservices.controller;

import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.system.gestor.microservices.model.Pedido;

@RestController
@RequestMapping("/api/v1/pedidos") /* Boa pratica pois v1 v2 v3 voce cria novas apis sem quebrar as anteriores! */
public class PedidoController {

	private final org.slf4j.Logger logger = LoggerFactory.getLogger(PedidoController.class);

	@PostMapping
	public ResponseEntity<Pedido> criarPedido(@RequestBody Pedido pedido) {

		logger.info("Pedido Recebido: {}", pedido.toString());
		return ResponseEntity.status(HttpStatus.CREATED).body(pedido);

	}

}
