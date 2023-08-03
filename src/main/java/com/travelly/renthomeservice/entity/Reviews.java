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

    @ManyToOne(cascade = {CascadeType.PERSIST, CascadeType.DETACH, CascadeType.MERGE, CascadeType.REFRESH})
    @JoinColumn(name = "property_id")
    private Properties propertyId;

    @Column(name = "rating", columnDefinition = "NUMERIC(5,2)")
    private Double rating;

    @Column(name = "comment")
    private String comment;

    @Column(name = "created_at")
    @NonNull
    private Timestamp createdAt;

}
