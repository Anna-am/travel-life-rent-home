package com.travelly.renthomeservice.entity;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;
import java.util.UUID;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "rh_images", schema = "postgres")
public class Images {
    @Id
    @Column(name = "id")
    @GeneratedValue
    private UUID id;
    @Column(name = "property_id")
    private UUID propertyId;
    @Column(name = "value")
    private byte[] value;
    @Column(name = "created_at")
    private LocalDateTime createdAt;

}
