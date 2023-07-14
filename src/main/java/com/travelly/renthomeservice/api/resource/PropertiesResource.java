package com.travelly.renthomeservice.api.resource;

import com.travelly.renthomeservice.api.dto.PropertiesDto;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.tags.Tag;
import io.swagger.v3.oas.annotations.tags.Tags;
import org.springframework.web.bind.annotation.PostMapping;


@Tags(
        value = {
                @Tag(name = "объявление", description = "Работа с объявлениями")
        }
)

public interface PropertiesResource {

    @PostMapping("/rent-home/property")
    @Operation(summary = "Создание объявления")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "Объявление создано",
                    content = {@Content(mediaType = "application/json",
                            schema = @Schema(implementation = PropertiesDto.class))})})
    PropertiesDto createProperties(PropertiesDto propertiesDto);
}
