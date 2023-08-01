package com.travelly.renthomeservice.api.kafka;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class PropertiesMessage {

    private String propertyName;

    private String description;

    private String address;

    private String city;

    private String zipCode;

    private String country;

    private String propertyType;

    private String bedrooms;

    private String bathrooms;

    private String accommodates;

    private BigDecimal pricePerNight;

    private BigDecimal pricePerMonth;

    private Integer minimumStayDays;

    private Integer maximumStayDays;

    private Boolean availableBooking;

    private LocalDateTime createdAt;
}
