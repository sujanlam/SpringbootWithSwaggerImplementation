package com.swag.controllers;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.security.SecurityRequirement;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SecurityRequirement(name = "auth")
@Tag(name = "My API", description = "API for managing data")
public class DataController {

    @GetMapping("/getData")
    @Operation(
            summary = "Get data by parameter", description = "Returns data for the given parameter",
            tags = "Test Swagger"
    )
    @ApiResponses(value={
            @ApiResponse(responseCode = "200", description = "Successful retrieval of data"),
            @ApiResponse(responseCode = "400", description = "Invalid param"),
            @ApiResponse(responseCode = "500", description = "Internal server error")
    })
    public String getData(@RequestParam @Parameter(description = "Parameter to get data for") String param) {
        return "Data for " + param;
    }
}

