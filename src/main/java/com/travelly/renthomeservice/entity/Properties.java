package com.travelly.renthomeservice.entity;

import jakarta.persistence.*;
import lombok.*;
import org.hibernate.annotations.GenericGenerator;

import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.UUID;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Table(name = "rh_properties")
public class Properties implements Serializable {

    @Id
    @GeneratedValue(generator = "UUID")
    @GenericGenerator(name = "UUID", strategy = "org.hibernate.id.UUIDGenerator")
    private UUID id;

    @JoinColumn(name = "property_name")
    private String propertyName;

    @JoinColumn(name = "description")
    private String description;

    @JoinColumn(name = "address")
    private String address;

    @JoinColumn(name = "city")
    private String city;

    @JoinColumn(name = "zip_code")
    private String zipCode;

    @JoinColumn(name = "country")
    private String country;

    @JoinColumn(name = "property_type")
    private String propertyType;

    @JoinColumn(name = "bedrooms")
    private String bedrooms;

    @JoinColumn(name = "bathrooms")
    private String bathrooms;

    @JoinColumn(name = "accommodates")
    private String accommodates;

    @JoinColumn(name = "price_per_night")
    private BigDecimal pricePerNight;

    @JoinColumn(name = "price_per_month")
    private BigDecimal pricePerMonth;

    @JoinColumn(name = "minimum_stay_days")
    private Integer minimumStayDays;

    @JoinColumn(name = "maximum_stay_days")
    private Integer maximumStayDays;

    @JoinColumn(name = "available_booking")
    private Boolean availableBooking;

    @JoinColumn(name = "created_at")
    private LocalDateTime createdAt;

    @JoinColumn(name = "updated_at")
    private LocalDateTime updatedAt;


}
