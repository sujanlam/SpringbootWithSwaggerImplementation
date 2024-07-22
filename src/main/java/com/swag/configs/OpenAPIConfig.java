package com.swag.configs;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.enums.SecuritySchemeIn;
import io.swagger.v3.oas.annotations.enums.SecuritySchemeType;
import io.swagger.v3.oas.annotations.info.Contact;
import io.swagger.v3.oas.annotations.info.Info;
import io.swagger.v3.oas.annotations.info.License;
import io.swagger.v3.oas.annotations.security.SecurityScheme;
import io.swagger.v3.oas.annotations.servers.Server;

@OpenAPIDefinition(
        info = @Info(
                title = "Swagger App API",
                description = "Implementing Swagger",
                summary = "Testing swagger implementation.",
                termsOfService = "T&C",
                contact = @Contact(
                        name = "Chelsea",
                        email = "chelsea@chelsea.com"
                ),
                license = @License(
                        name = "My license No 323232"
                ),
                version = "v1"
        ),
        servers = {
                @Server(
                        description = "Dev",
                        url = "http://localhost:8080"
                ),
                @Server(
                        description = "Test",
                        url = "http://localhost:8080"
                )
        }
)
@SecurityScheme(
        name = "authBearer",
        in = SecuritySchemeIn.HEADER,
        type = SecuritySchemeType.HTTP,
        bearerFormat = "JWT",
        scheme="bearer",
        description = "Security Description")
public class OpenAPIConfig {
}
