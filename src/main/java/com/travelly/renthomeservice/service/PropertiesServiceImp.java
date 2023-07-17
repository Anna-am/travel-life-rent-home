package com.travelly.renthomeservice.service;

import com.travelly.renthomeservice.entity.Properties;
import com.travelly.renthomeservice.repository.PropertiesRepository;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;


@Service
@AllArgsConstructor
@Slf4j
public class PropertiesServiceImp implements PropertyService{

    private final PropertiesRepository propertiesRepository;

    public void addProperty(Properties property) {
        log.info("сохранение объявления {}  в бд", property);
        property.setAvailableBooking(true);
        property.setCreatedAt(LocalDateTime.now());
        property.setUpdatedAt(LocalDateTime.now());
        propertiesRepository.save(property);
    }
}
