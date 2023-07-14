package com.travelly.renthomeservice.service;

import com.travelly.renthomeservice.entity.Properties;
import com.travelly.renthomeservice.repository.PropertiesRepository;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;


@Service
@AllArgsConstructor
@Slf4j
public class PropertiesService {

    private final PropertiesRepository propertiesRepository;

    public void addProperty(Properties properties) {
        log.info("сохранение объявления в бд");
        propertiesRepository.save(properties);
    }

}
