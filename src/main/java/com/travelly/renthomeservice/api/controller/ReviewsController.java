package com.travelly.renthomeservice.api.controller;

import com.travelly.renthomeservice.api.dto.ReviewsDtoRequest;
import com.travelly.renthomeservice.api.exception.PropertiesNotFoundException;
import com.travelly.renthomeservice.api.resource.ReviewsResource;
import com.travelly.renthomeservice.api.service.ReviewsService;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

@RestController
@AllArgsConstructor
@Slf4j
public class ReviewsController implements ReviewsResource {
    private final ReviewsService reviewsService;

    @Override
    public ResponseEntity<String> addReviews(UUID propertyId, ReviewsDtoRequest reviewsDtoRequest) {
        try {
            reviewsService.saveReviews(propertyId, reviewsDtoRequest);
            return new ResponseEntity<>("Отзыв успешно добавлен к объявлению", HttpStatus.OK);
        } catch (PropertiesNotFoundException e) {
            log.error("Отзыв не может быть сохранен");
            return new ResponseEntity<>("Отзыв не может быть сохранен", HttpStatus.BAD_REQUEST);

        }
    }
}
