package com.travelly.renthomeservice.service;

import com.travelly.renthomeservice.api.dto.PropertiesDto;
import com.travelly.renthomeservice.api.repository.PropertiesRepository;
import com.travelly.renthomeservice.api.util.PropertiesMapper;
import com.travelly.renthomeservice.entity.Properties;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.time.LocalDateTime;

@Service
@AllArgsConstructor
@Slf4j
public class PropertiesServiceImp implements PropertyService {

    private final PropertiesRepository propertiesRepository;
    private final PropertiesMapper propertiesMapper;

    @Transactional
    public Properties addProperty(PropertiesDto propertyDto) {
        final Properties property = propertiesMapper.convertToProperties(propertyDto);
        property.setAvailableBooking(true);
        property.setCreatedAt(LocalDateTime.now());
        property.setUpdatedAt(LocalDateTime.now());
        log.info("save property {} in BD", property);
        propertiesRepository.save(property);
        return property;
    }
}
