//package com.travelly.renthomeservice.controllers;
//
//import com.fasterxml.jackson.core.JsonProcessingException;
//import com.fasterxml.jackson.databind.ObjectMapper;
//import com.travelly.renthomeservice.RentHomeServiceApplicationTests;
//import com.travelly.renthomeservice.entity.Properties;
//import com.travelly.renthomeservice.repository.PropertiesRepository;
//import org.junit.jupiter.api.AfterEach;
//import org.junit.jupiter.api.BeforeEach;
//import org.junit.jupiter.api.Test;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.http.MediaType;
//import org.springframework.test.web.servlet.MockMvc;
//import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
//
//
//import java.math.BigDecimal;
//
//import static com.travelly.renthomeservice.api.util.UrlConstant.URL_RHS_PROPERTIES;
//import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
//
//public class PropertiesControllerTest extends RentHomeServiceApplicationTests {
//
//    @Autowired
//    private MockMvc mvc;
//    @Autowired
//    private PropertiesRepository propertiesRepository;
//
//    private Properties testProperty;
//
//
//    @BeforeEach
//    public void setUp() {
//        testProperty = new Properties(null, "тур", "поход в кино",
//                "Пролетарская улица, д.7", "Москва", "123456", null, "Хостел",
//                "2", "1", "4", new BigDecimal(1000), new BigDecimal(30000),
//                1, 30, false, null, null);
//    }
//
//    @Test
//    void addPropertyTest() throws Exception {
//        mvc.perform(MockMvcRequestBuilders
//                        .post(URL_RHS_PROPERTIES)
//                        .contentType(MediaType.APPLICATION_JSON)
//                        .content(mapToJson(testProperty))
//                        .accept(MediaType.APPLICATION_JSON))
//                .andExpect(status().isOk());
//    }
//
//    protected String mapToJson(Object obj) throws JsonProcessingException {
//        final ObjectMapper objectMapper = new ObjectMapper();
//        return objectMapper.writeValueAsString(obj);
//    }
//
//    @AfterEach
//    public void tearDown() {
//        propertiesRepository.delete(testProperty);
//    }
//}
