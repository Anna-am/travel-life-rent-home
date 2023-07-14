package com.travelly.renthomeservice.api.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Schema(description = "Объект для добавления отзыва")
public class ReviewsDtoRequest {
    @Schema(description = "Рейтинг объявления")
    private Double rating;
    @Schema(description = "Комментарий к объявлению")
    private String comment;

}
