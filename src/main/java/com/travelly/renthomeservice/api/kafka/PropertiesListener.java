package com.travelly.renthomeservice.api.kafka;

import com.travelly.renthomeservice.api.util.PropertiesMapper;
import com.travelly.renthomeservice.service.PropertyService;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Service;

@Slf4j
@Service
@AllArgsConstructor
public class PropertiesListener {

    private PropertyService propertyService;
    private PropertiesMapper propertiesMapper;

    @KafkaListener(topics = "tg_property_pub")
    public void receive(@Payload PropertiesMessage data) {
        log.info("received data='{}'", data);

        com.travelly.renthomeservice.entity.Properties property = propertyService.addProperty(propertiesMapper.convertToPropertiesDto(data));
            log.info("Property with id {} was added to db", property.getId());
    }

}
