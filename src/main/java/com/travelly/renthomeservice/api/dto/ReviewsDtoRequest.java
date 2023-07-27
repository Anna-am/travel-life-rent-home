package com.travelly.renthomeservice.api.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Schema(description = "Объект для добавления отзыва")
public class ReviewsDtoRequest {
    @NonNull
    @Schema(description = "Рейтинг объявления")
    private Double rating;
    @NonNull
    @Schema(description = "Комментарий к объявлению")
    private String comment;

}
