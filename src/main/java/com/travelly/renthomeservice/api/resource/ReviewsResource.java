package com.travelly.renthomeservice.api.resource;

import com.travelly.renthomeservice.api.dto.ExampleDto;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.tags.Tag;
import io.swagger.v3.oas.annotations.tags.Tags;
import jakarta.validation.constraints.NotNull;

import java.util.UUID;

@Tags(
        value = {
                @Tag(name = "Отзыв", description = "Ресурс для добавление отзыва к объявлению")
        }
)
public interface ReviewsResource {

        @Operation(summary = "Добавление отзыва по id в бд")
        @ApiResponses(value = {
                @ApiResponse(responseCode = "200", description = "Отзыв добавлен к объявлению",
                        content = {@Content(mediaType = "application/json",
                                schema = @Schema(implementation = ExampleDto.class))}),
                @ApiResponse(responseCode = "400", description = "Предоставлен неверный идентификатор",
                        content = @Content),
                @ApiResponse(responseCode = "404", description = "Обьявление по заданному идентификатору не найдено",
                        content = @Content)})
        ExampleDto getExampleByID(@Parameter(description = "Идентификатор счета для поиска") @NotNull UUID uuid);
}
