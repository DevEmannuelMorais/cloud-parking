package dio.desafioprojeto.emanuel.dio.config;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Contact;
import io.swagger.v3.oas.annotations.info.Info;
import io.swagger.v3.oas.annotations.info.License;
import io.swagger.v3.oas.annotations.servers.Server;

@OpenAPIDefinition(info = @Info(
        contact = @Contact(
                name = "Emannuel Morais",
                email = "emanuelmorais2015@gmail.com",
                url = "https://github.com/DevEmannuelMorais"
        ),
        description = "OpenApi documentation da minha Estacionamento usando Spring Boot",
        title = "OpenApi especificações - DevEmannuelMorais",
        version = "1.0",
        license = @License(
                name = "Licença Estacionamento Digital",
                url = "https://www.jusbrasil.com.br/artigos/o-direito-do-consumidor-e-as-academias-de-ginastica/183577567"
        ),termsOfService = "Termos de Seviço"
),
        servers = {
                @Server(
                        description = "Local ENV",
                        url = "http://localhost:8080"
                ),
                @Server(description = "Prod ENV",
                        url = "https://github.com/DevEmannuelMorais/academia-digital")
        })
public class OpenApiConfig {

}
