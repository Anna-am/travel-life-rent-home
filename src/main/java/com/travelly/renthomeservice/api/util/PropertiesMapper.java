package com.travelly.renthomeservice.api.util;

import com.travelly.renthomeservice.api.dto.PropertiesDto;
import com.travelly.renthomeservice.entity.Properties;
import lombok.AllArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class PropertiesMapper {

    private final ModelMapper modelMapper;

    public Properties convertToProperties (PropertiesDto propertiesDto) {
        return modelMapper.map(propertiesDto, Properties.class);
    }

    public PropertiesDto convertToPropertiesDto (Properties properties) {
        return modelMapper.map(properties, PropertiesDto.class);
    }
}
