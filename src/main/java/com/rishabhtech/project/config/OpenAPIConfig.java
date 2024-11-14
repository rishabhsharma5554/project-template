package com.rishabhtech.project.config;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Contact;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.info.License;
import io.swagger.v3.oas.models.servers.Server;
import java.util.List;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class OpenAPIConfig {

  @Value("${rishabhtech.openapi.dev-url}")
  private String devUrl;

  @Value("${rishabhtech.openapi.prod-url}")
  private String prodUrl;

  @Bean
  public OpenAPI myOpenAPI() {
    Server devServer = new Server();
    devServer.setUrl(devUrl);
    devServer.setDescription("Server URL in Development environment");

    Server prodServer = new Server();
    prodServer.setUrl(prodUrl);
    prodServer.setDescription("Server URL in Production environment");

    Contact contact = new Contact();
    contact.setEmail("rishabhtech@gmail.com");
    contact.setName("Rishabh Technologies");
    contact.setUrl("https://www.rishabhtech.com");

    License mitLicense =
        new License().name("MIT License").url("https://choosealicense.com/licenses/mit/");

    Info info =
        new Info()
            .title("Rishabh Technologies Project Template API")
            .version("0.1")
            .contact(contact)
            .description("This API exposes endpoints to manage project tempalate.")
            .termsOfService("https://www.rishabhtech.com/terms")
            .license(mitLicense);

    return new OpenAPI().info(info).servers(List.of(devServer, prodServer));
  }
}
