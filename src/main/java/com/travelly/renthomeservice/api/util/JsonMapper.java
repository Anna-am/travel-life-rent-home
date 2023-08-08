package com.travelly.renthomeservice.api.util;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.stereotype.Component;

@Component
public class JsonMapper {
    public <T> T mapFromJson(String json, Class<T> tClass) throws JsonProcessingException {
        return new ObjectMapper().readValue(json, tClass);
    }
}
