package com.travelly.renthomeservice.api.controllers;

import com.travelly.renthomeservice.api.dto.PropertiesDto;
import com.travelly.renthomeservice.api.resource.PropertiesResource;
import com.travelly.renthomeservice.api.util.PropertiesMapper;
import com.travelly.renthomeservice.service.PropertiesService;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
@AllArgsConstructor
public class PropertiesController implements PropertiesResource {

    private final PropertiesService propertiesService;
    private final PropertiesMapper propertiesMapper;


    @Override
    public void createProperties(PropertiesDto propertiesDto) {
        log.info("добавление объявления");
        propertiesService.addProperty(propertiesMapper.convertToProperties(propertiesDto));
    }
}
