package com.travelly.renthomeservice.api.service;

import com.travelly.renthomeservice.api.repository.PropertiesRepository;
import com.travelly.renthomeservice.entity.Properties;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.antlr.v4.runtime.CodePointBuffer;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.UUID;

@Service
@AllArgsConstructor
@Slf4j
public class PropertyService {

    private  final PropertiesRepository propertiesRepository;
    public void saveProp(){
        Properties properties = new Properties();
        properties.setAccommodates("WQE");
        properties.setCity("saf");
        properties.setAddress("asd");
        properties.setBedrooms("sad");
        properties.setBathrooms("asd");
        properties.setCountry("dasd");
        properties.setPropertyName("asd");
        properties.setPropertyType("asd");
        properties.setAvailableBooking(true);
        properties.setDescription("asd");
        properties.setMaximumStayDays(12);
        properties.setPricePerMonth(BigDecimal.valueOf(12));
        properties.setMinimumStayDays(12);
        properties.setPricePerNight(BigDecimal.valueOf(11));
        properties.setZipCode("sad");
        properties.setUpdatedAt(LocalDateTime.now());
        propertiesRepository.save(properties);


    }
}
