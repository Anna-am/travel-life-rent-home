package com.travelly.renthomeservice.api.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;


/**
 * ЭТО ПРИМЕР, ТУТ НИЧЕГО НЕ ТРОГАТЬ!
 * НУЖНО ОЗНАКОМИТЬСЯ И ПО АНАЛОГИИ НАПИСАТЬ СВОЮ РЕАЛИЗАЦИЮ В ЭТОЙ ЖЕ ДИРЕКТОРИИ
 *
 */
@Data
@Builder(toBuilder = true)
@AllArgsConstructor
@NoArgsConstructor
@Schema(description = "Объект для представления ошибки")
public class ValidationFieldInfo {

    @NotBlank
    @Schema(example = "accountNumber", description = "Имя поля")
    private String fieldName;

    @NotBlank
    @Schema(example = "Неверный номер счета(длина не соответствует требованиям)", description = "Сообщение об ошибки")
    private String message;

    @NotBlank
    @Schema(example = "408178L0099910004312", description = "Переданное не верное значение")
    private String rejectValue;
}
