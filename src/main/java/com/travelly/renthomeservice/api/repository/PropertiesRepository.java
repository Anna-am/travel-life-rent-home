package com.travelly.renthomeservice.api.repository;

import com.travelly.renthomeservice.entity.Properties;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;
@Repository
public interface PropertiesRepository extends JpaRepository<Properties,UUID> {
}
