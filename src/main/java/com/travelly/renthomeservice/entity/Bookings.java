package com.travelly.renthomeservice.entity;

import jakarta.persistence.*;
import lombok.*;

import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.UUID;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Table(name = "rh_bookings", schema = "postgres")
public class Bookings {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    @Column(name = "id")
    private UUID id;

    @Column(name = "property_id")
    private UUID propertyId;

    @Column(name = "check_in_date")
    private Timestamp checkInDate;

    @Column(name = "check_out_date")
    private Timestamp checkOutDate;

    @Column(name = "total_price")
    private BigDecimal totalPrice;

    @Column(name = "payment_status")
    private String paymentStatus;

    @Column(name = "created_at")
    private Timestamp createdAt;

    @Column(name = "updated_at")
    private Timestamp updatedAt;
}
