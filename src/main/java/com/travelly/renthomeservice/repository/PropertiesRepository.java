package com.travelly.renthomeservice.repository;

import com.travelly.renthomeservice.entity.Properties;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface PropertiesRepository extends JpaRepository<Properties, UUID> {
}
