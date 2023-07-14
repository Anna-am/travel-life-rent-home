package com.travelly.renthomeservice.api.util;

import com.travelly.renthomeservice.api.dto.PropertiesDto;
import com.travelly.renthomeservice.entity.Properties;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

@Service
@Slf4j
@AllArgsConstructor
public class PropertiesMapper {

    private final ModelMapper modelMapper;

    public Properties convertToProperties (PropertiesDto propertiesDto) {
        log.info("конвертация из entity в dto");
        return modelMapper.map(propertiesDto, Properties.class);
    }

    public PropertiesDto convertToPropertiesDto (Properties properties) {
        log.info("конвертация из dto в entity");
        return modelMapper.map(properties, PropertiesDto.class);
    }
}
