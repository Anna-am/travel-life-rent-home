package com.travelly.renthomeservice.api.repository;

import com.travelly.renthomeservice.entity.Reviews;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface ReviewsRepository extends JpaRepository<Reviews, UUID> {
}
