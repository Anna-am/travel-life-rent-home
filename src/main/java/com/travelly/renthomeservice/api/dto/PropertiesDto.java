package com.travelly.renthomeservice.api.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.util.UUID;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class PropertiesDto {

    @Schema(example = "123e4567-e89b-12d3-a456-426614174000", description = "Уникальный идентификатор")
    @NotNull
    private UUID id;

    @Schema(example = "свойство", description = "название свойства")
    @NotNull
    private String propertyName;

    @Schema(example = "описание", description = "описание места проживания")
    @NotNull
    private String description;

    @Schema(example = "адресс", description = "адресс места проживания")
    @NotNull
    private String address;

    @Schema(example = "город", description = "название города места проживания")
    @NotNull
    private String city;

    @Schema(example = "индекс", description = "почтовый индекс")
    private String zipCode;

    @Schema(example = "страна", description = "название страны места проживания")
    @NotNull
    private String country;

    @Schema(example = "тип", description = "тип жилья")
    private String propertyType;

    @Schema(example = "спальни", description = "количество спален")
    private String bedrooms;

    @Schema(example = "ванные", description = "колчество ванных комнат")
    private String bathrooms;

    @Schema(example = "вместительность", description = "количество проживающих")
    private String accommodates;

    @Schema(example = "цена за ночь", description = "цена за одну ночь")
    private BigDecimal pricePerNight;

    @Schema(example = "цена за месяц", description = "цена за один месяц")
    private BigDecimal pricePerMonth;

    @Schema(example = "мимнимальное количество дней", description = "минимальное количество дней проживания")
    private Integer minimumStayDays;

    @Schema(example = "максимальное количество дней", description = "максимальное количество дней проживания")
    private Integer maximumStayDays;

    @Schema(example = "доступ для брони", description = "доступно для бронирование")
    @NotNull
    private Boolean availableBooking;


}
