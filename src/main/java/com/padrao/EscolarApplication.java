package com.padrao;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;

@SpringBootApplication
public class EscolarApplication {

    public static void main(String[] args) {
        SpringApplication.run(EscolarApplication.class, args);
    }

    @Bean  // configurações do Swagger
    public Docket swaggerConfiguration() {

        return new Docket(DocumentationType.SWAGGER_2)
                .select()
                .paths(PathSelectors.ant("/api/**"))  // só irá procurar paths que comecem com "/api/"
                .apis(RequestHandlerSelectors.basePackage("com.padrao"))  // só irá procurar apis dentro do pacote "com.padrao"
                .build();
    }
}
