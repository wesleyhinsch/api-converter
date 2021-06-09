package com.api.converter.config;

import static springfox.documentation.builders.PathSelectors.*;
import static springfox.documentation.builders.PathSelectors.regex;

import java.util.ArrayList;
import java.util.function.Predicate;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.service.VendorExtension;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
@EnableSwagger2
public class SwaggerConfig {

    @Bean
    public Docket converterApi() {
        return new Docket(DocumentationType.SWAGGER_2)
            .groupName("api-converter-v1")
            .select()
            .apis(RequestHandlerSelectors.basePackage("com.api.converter"))
            .paths(regex("/.*"))
            .build()
            .apiInfo(metaInfoConverter());
    }

    private ApiInfo metaInfoConverter() {

        ApiInfo apiInfo = new ApiInfo(
            "API Converter",
            "API REST - converter values.",
            "1.0.0",
            "Termos de Servico",
            new Contact("Wesley Hinsch", "https://www.linkedin.com/in/wesleyhinsch/",
                "wesleyhinsch@gmail.com"),
            "Built for Kubedev",
            "https://kubedev.io/", new ArrayList<VendorExtension>()
        );
        return apiInfo;
    }
}
