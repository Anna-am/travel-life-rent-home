package com.travelly.renthomeservice.api.resource;

import com.travelly.renthomeservice.api.dto.PropertiesDto;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.tags.Tag;
import io.swagger.v3.oas.annotations.tags.Tags;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import static com.travelly.renthomeservice.api.util.UrlConstants.URL_RHS_PROPERTIES;

@Tags(value = {@Tag(name = "объявление", description = "Работа с объявлениями")})

public interface PropertiesResource {

    @PostMapping(URL_RHS_PROPERTIES)
    @Operation(summary = "Создание объявления")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "Объявление создано",
                    content = {@Content(mediaType = "application/json",
                            schema = @Schema(implementation = PropertiesDto.class))})})
    ResponseEntity<HttpStatus> createProperties(@RequestBody PropertiesDto propertyDto);
}
