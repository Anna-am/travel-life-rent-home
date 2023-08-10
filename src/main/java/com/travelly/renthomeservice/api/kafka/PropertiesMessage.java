package com.travelly.renthomeservice.api.kafka;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class PropertiesMessage {

    @JsonProperty("property_name")
    private String propertyName;

    @JsonProperty("description")
    private String description;

    @JsonProperty("address")
    private String address;

    @JsonProperty("city")
    private String city;

    @JsonProperty("zip_code")
    private String zipCode;

    @JsonProperty("country")
    private String country;

    @JsonProperty("property_type")
    private String propertyType;

    @JsonProperty("bedrooms")
    private String bedrooms;

    @JsonProperty("bathrooms")
    private String bathrooms;

    @JsonProperty("accommodates")
    private String accommodates;

    @JsonProperty("price_per_night")
    private BigDecimal pricePerNight;

    @JsonProperty("price_per_month")
    private BigDecimal pricePerMonth;

    @JsonProperty("minimum_stay_days")
    private Integer minimumStayDays;

    @JsonProperty("maximum_stay_days")
    private Integer maximumStayDays;

    @JsonProperty("available_booking")
    private Boolean availableBooking;

    @JsonProperty("created_at")
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd HH:mm:ss.SSSSSS")
    private LocalDateTime createdAt;
}
