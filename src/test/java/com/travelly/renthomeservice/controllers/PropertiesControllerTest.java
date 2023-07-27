package com.travelly.renthomeservice.controllers;

import com.travelly.renthomeservice.RentHomeServiceApplication;
import com.travelly.renthomeservice.api.repository.PropertiesRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;

import static com.travelly.renthomeservice.api.util.UrlConstants.URL_RHS_PROPERTIES;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@WebMvcTest(RentHomeServiceApplication.class)
public class PropertiesControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @MockBean
    private PropertiesRepository propertiesRepository;

    @Test
    void addPropertyTest() throws Exception {
        final String json = "{\"propertyName\":\"тур\",\"description\":\"поход в кино\"," +
                "\"address\":\"Пролетарская улица, д.7\",\"city\":\"Moscow\",\"zipCode\":123456," +
                "\"country\":\"Россия\",\"propertyType\":\"хостел\",\"bedrooms\":2,\"bathrooms\":1," +
                "\"accommodates\":4,\"pricePerNight\":1000,\"pricePerMonth\":30000,\"minimumStayDays\":1," +
                "\"maximumStayDays\":30,\"availableBooking\":false}";
        mockMvc.perform(
                        post(URL_RHS_PROPERTIES)
                                .contentType(MediaType.APPLICATION_JSON)
                                .content(json)
                )
                .andDo(print())
                .andExpect(status().isCreated());
    }
}
