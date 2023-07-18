package com.travelly.renthomeservice.api.resource;

import com.travelly.renthomeservice.api.dto.ReviewsDtoRequest;
import com.travelly.renthomeservice.api.util.UrlConstants;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.tags.Tag;
import io.swagger.v3.oas.annotations.tags.Tags;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.UUID;

@Tags(
        value = {
                @Tag(name = "Отзыв", description = "Ресурс для добавление отзыва к объявлению")
        }
)
@RequestMapping(UrlConstants.RENT_HOME_URL)
public interface ReviewsResource {
    @PostMapping("/property/{id}/review")
    @Operation(summary = "Добавление отзыва в бд")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "Отзыв добавлен к объявлению",
                    content = {@Content(mediaType = "application/json",
                            schema = @Schema(implementation = String.class))}),
            @ApiResponse(responseCode = "400", description = "Предоставлен неверный идентификатор",
                    content = @Content)})
    ResponseEntity<String> addReviews(@PathVariable("id") UUID propertyId, @RequestBody ReviewsDtoRequest reviewsDtoRequest);

}
