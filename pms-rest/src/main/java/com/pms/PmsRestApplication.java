package com.pms;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;

@SpringBootApplication
@OpenAPIDefinition(
    info = @Info(title = "PMS API", version = "1.0", description = "API documentation for PMS")
)
public class PmsRestApplication {
    public static void main(String[] args) {
        SpringApplication.run(PmsRestApplication.class, args);
    }
}
