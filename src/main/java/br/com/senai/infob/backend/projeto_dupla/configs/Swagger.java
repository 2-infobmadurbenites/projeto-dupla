package br.com.senai.infob.backend.projeto_dupla.configs;

import org.springframework.context.annotation.Configuration;

@Configuration
@OpenAPIDefinition(
    info = @info(
        title = "Projeto Mercado",
        version = "1.0",
        description = "API para o sistema de mercado teste"
    )
)
public class Swagger {
    
}
