package com.travelly.renthomeservice.controllers;

import com.travelly.renthomeservice.api.dto.PropertiesDto;
import com.travelly.renthomeservice.api.resource.PropertiesResource;
import com.travelly.renthomeservice.service.PropertyService;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
@AllArgsConstructor
public class PropertiesController implements PropertiesResource {

    private PropertyService propertyService;

    public ResponseEntity<HttpStatus> createProperties(PropertiesDto propertyDto) {
        log.info("app property");
        propertyService.addProperty(propertyDto);
        return ResponseEntity.ok(HttpStatus.OK);
    }
}
