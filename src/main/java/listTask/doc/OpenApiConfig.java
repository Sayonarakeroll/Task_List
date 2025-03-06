package listTask.doc;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Contact;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.info.License;
import org.springdoc.core.models.GroupedOpenApi;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class OpenApiConfig {

    @Bean
    public OpenAPI customOpenAPI() {
        return new OpenAPI()
                .info(new Info()
                        .title("Title - List Task")
                        .version("0.0.1-SNAPSHOT")
                        .description("API Lista de Tarefas")
                        .termsOfService("Termo de uso Open Source")
                        .contact(new Contact()
                                .name("Seu nome")
                                .url("http://www.seusite.com.br")
                                .email("voce@seusite.com.br"))
                        .license(new License()
                                .name("Licenca - Sua Empresa")
                                .url("http://www.seusite.com.br")));
    }

    //config endpoints
    @Bean
    public GroupedOpenApi publicApi() {
        return GroupedOpenApi.builder()
                .group("public-api")
                .pathsToMatch("/tasks/**") // Caminhos para documentar
                .packagesToScan("listTask.controller")
                .build();

    }
}