package com.travelly.renthomeservice.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;

import java.sql.Timestamp;
import java.util.UUID;


@Entity
@Data
@NoArgsConstructor(force = true)
@AllArgsConstructor
@Table(name = "rh_reviews", schema = "postgres")
public class rhReviews {

    @Id
    @Column(name = "id")
    @GeneratedValue
    private UUID id;

    @Column(name = "property_id")
    @GeneratedValue
    private UUID propertyId;

    @Column(name = "rating", columnDefinition = "NUMERIC(5,2)")
    private Double rating;

    @Column(name = "comment")
    private String comment;

    @Column(name = "created_at")
    @NonNull
    private Timestamp createdAt;

}
