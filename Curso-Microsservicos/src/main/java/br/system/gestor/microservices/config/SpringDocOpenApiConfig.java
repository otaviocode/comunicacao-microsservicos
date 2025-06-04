package br.system.gestor.microservices.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Contact;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.info.License;

@Configuration
public class SpringDocOpenApiConfig {
	
	@Bean
	public OpenAPI openApi() {

	    return new OpenAPI()
	    	.info(new Info()
	    	.title("Rest API - Pedidos")
	    	.description("API para realização de pedidos")
	    	.license(new License().name("Apache 2.0").url("https://www.apache.org/licenses/#licenses"))
	    	.contact(new Contact().name("Otávio Luiz").email("otavio.luiz.dev@gmail.com")));
	    	
	}

}
