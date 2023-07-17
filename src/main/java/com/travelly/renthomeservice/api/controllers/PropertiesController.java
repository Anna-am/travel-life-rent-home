package com.travelly.renthomeservice.api.controllers;

import com.travelly.renthomeservice.api.dto.PropertiesDto;
import com.travelly.renthomeservice.api.resource.PropertiesResource;
import com.travelly.renthomeservice.api.util.PropertiesMapper;
import com.travelly.renthomeservice.service.PropertiesServiceImp;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
@AllArgsConstructor
public class PropertiesController implements PropertiesResource {

    private final PropertiesServiceImp propertiesServiceImp;
    private final PropertiesMapper propertiesMapper;


    @Override
    public ResponseEntity<Object> createProperties(PropertiesDto propertyDto) {
        log.info("добавление объявления");
        propertiesServiceImp.addProperty(propertiesMapper.convertToProperties(propertyDto));
        return ResponseEntity.ok(HttpStatus.OK);
    }
}
