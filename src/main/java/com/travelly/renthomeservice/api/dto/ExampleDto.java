package com.travelly.renthomeservice.api.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;
import lombok.Data;

import java.util.UUID;

/**
 * ЭТО ПРИМЕР, ТУТ НИЧЕГО НЕ ТРОГАТЬ!
 * НУЖНО ОЗНАКОМИТЬСЯ И ПО АНАЛОГИИ НАПИСАТЬ СВОЮ РЕАЛИЗАЦИЮ В ЭТОЙ ЖЕ ДИРЕКТОРИИ
 *
 */
@Data
@Schema(description = "Объект для представления")
public class ExampleDto {

    @Schema(example = "123e4567-e89b-12d3-a456-426614174000", description = "Уникальный идентификатор")
    private UUID id;

    @NotEmpty(message = "account.dto.validate.accountNumber.isEmpty")
    @Size(min = 20, max = 20, message = "account.dto.validate.accountNumber.size")
    @Pattern(regexp = "^\\d+$", message = "account.dto.validate.accountNumber.pattern")
    @Schema(example = "40817810099910004312", description = "Номер счета")
    private String accountNumber;
}
