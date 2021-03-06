package com.uppgift.vning.sahraBile;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;


@Configuration
@EnableSwagger2
public class SwaggerConfig {

    /**
     * Docket select method actually indicate that it's going to return the
     * API selected builder and this build method is actually to provide all
     * the API related information while  building the swagger.
     * This is something docket already provided
     */
    @Bean
    public Docket swaggerApiConfig() {
        return new Docket(DocumentationType.SWAGGER_2)
                .select()
                .paths(PathSelectors.any())
                .apis(RequestHandlerSelectors.basePackage("com.BACKHOPPNING.biograf"))
                .build();

    }
}

