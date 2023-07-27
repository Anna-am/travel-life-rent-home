package com.travelly.renthomeservice.service;

import com.travelly.renthomeservice.api.dto.PropertiesDto;
import com.travelly.renthomeservice.entity.Properties;

public interface PropertyService {

    Properties addProperty(PropertiesDto propertyDto);
}
