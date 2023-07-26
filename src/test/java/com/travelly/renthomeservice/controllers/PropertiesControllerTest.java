package com.travelly.renthomeservice.controllers;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.travelly.renthomeservice.api.dto.PropertiesDto;
import com.travelly.renthomeservice.repository.PropertiesRepository;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.web.servlet.MockMvc;
import org.testcontainers.shaded.com.github.dockerjava.core.MediaType;

import java.math.BigDecimal;

import static com.travelly.renthomeservice.api.util.UrlConstant.URL_RHS_PROPERTIES;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@ExtendWith(MockitoExtension.class)
@WebMvcTest
public class PropertiesControllerTest {

    @Autowired
    private ObjectMapper objectMapper;

    @Autowired
    private MockMvc mockMvc;

    @MockBean
    private PropertiesRepository propertiesRepository;

//    @InjectMocks
//    private PropertiesServiceImp propertiesServiceImp;


    @Test
    void addPropertyTest() throws Exception {
//        String json = "{\"propertyName\":\"тур\",\"description\":\"поход в кино\"," +
//                "\"address\":\"Пролетарская улица, д.7\",\"city\":\"Moscow\",\"zipCode\":123456," +
//                "\"country\":\"Россия\",\"propertyType\":хостел,\"bedrooms\":2,\"bathrooms\":1,\"accommodates\":4," +
//                "\"pricePerNight\":1000,\"pricePerMonth\":30000,\"minimumStayDays\":1,\"maximumStayDays\":30," +
//                "\"availableBooking\":false}";
        final PropertiesDto testProperty1 = new PropertiesDto(null, "тур", "поход в кино",
                "Пролетарская улица, д.7", "Москва", "123456", null, "Хостел",
                "2", "1", "4", new BigDecimal(1000), new BigDecimal(30000),
                1, 30, false);
        Mockito.when(propertiesRepository.save(Mockito.any())).thenReturn(testProperty1);
        mockMvc.perform(
                post(URL_RHS_PROPERTIES)
                        .content(objectMapper.writeValueAsString(testProperty1))
                        .contentType(String.valueOf(MediaType.APPLICATION_JSON))
        )
                .andExpect(status().isCreated())
                .andExpect(jsonPath("$.id").isNotEmpty())
                .andExpect(jsonPath("$.availableBooking").value(true))
                .andExpect(jsonPath("$.createdAt").isNotEmpty());

//        propertiesServiceImp.addProperty(testProperty1);
//        assertNotSame(testProperty1, testProperty2);
//        Mockito.verify(propertiesRepository, Mockito.times(1)).save(testProperty1);
    }

}
