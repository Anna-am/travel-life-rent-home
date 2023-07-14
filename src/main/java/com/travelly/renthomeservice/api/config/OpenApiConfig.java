package com.travelly.renthomeservice.api.config;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Contact;
import io.swagger.v3.oas.annotations.info.Info;

@OpenAPIDefinition(
        info = @Info(
                title = "RentHome-service",
                description = "Аренда жилья за границей", version = "1.0.0",
                contact = @Contact(
                        name = "Maksimova Anna"
                )
        )
)
public class OpenApiConfig {
}
