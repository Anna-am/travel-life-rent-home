package com.travelly.renthomeservice.entity;

import jakarta.persistence.*;
import lombok.*;

import java.sql.Timestamp;
import java.util.UUID;


@Entity
@Data
@NoArgsConstructor(force = true)
@AllArgsConstructor
@Getter
@Setter
@Table(name = "rh_reviews", schema = "postgres")
public class Reviews {

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
