package com.travelly.renthomeservice.api.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.OffsetDateTime;
import java.util.List;
import java.util.Map;

/**
 * ЭТО ПРИМЕР, ТУТ НИЧЕГО НЕ ТРОГАТЬ!
 * НУЖНО ОЗНАКОМИТЬСЯ И ПО АНАЛОГИИ НАПИСАТЬ СВОЮ РЕАЛИЗАЦИЮ В ЭТОЙ ЖЕ ДИРЕКТОРИИ
 *
 */
@Data
@Builder(toBuilder = true)
@AllArgsConstructor
@NoArgsConstructor
public class ValidationErrorInfo {

    @NotNull
    @Schema(description = "Дата и время генерации ошибки")
    private OffsetDateTime timestamp;

    @NotBlank
    @Schema(example = "Ошибка валидации", description = "Сообщение об ошибки")
    private String message;

    @NotNull
    @Schema(description = "Код ошибки")
    private ErrorCode errorCode;

    @NotNull
    @Schema(description = "Развернутое описание ошибки/ок")
    private Map<String, List<ValidationFieldInfo>> errorDetails;
}
