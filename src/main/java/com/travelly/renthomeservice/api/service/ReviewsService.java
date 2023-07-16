package com.travelly.renthomeservice.api.service;

import com.travelly.renthomeservice.api.dto.ReviewsDtoRequest;
import com.travelly.renthomeservice.api.exception.PropertiesNotFoundException;
import com.travelly.renthomeservice.api.repository.PropertiesRepository;
import com.travelly.renthomeservice.api.repository.ReviewsRepository;
import com.travelly.renthomeservice.api.util.ReviewsMapper;
import com.travelly.renthomeservice.entity.Reviews;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.sql.Timestamp;
import java.time.LocalDateTime;
import java.util.UUID;

@Service
@AllArgsConstructor
@Slf4j
public class ReviewsService {
    private final ReviewsMapper reviewsMapper;
    private final ReviewsRepository reviewsRepository;
    private  final PropertiesRepository propertiesRepository;
    private  final  PropertyService propertyService;

    @Transactional
    public void saveReviews (UUID propertyId, ReviewsDtoRequest reviewsDtoRequest) {
        propertyService.saveProp();
        log.info("Cj[hfyty");
        if (propertiesRepository.findById(propertyId).isPresent()) {
            Reviews reviews = reviewsMapper.convertToDto(reviewsDtoRequest, Reviews.class);
            reviews.setCreatedAt(Timestamp.valueOf(LocalDateTime.now()));
            reviews.setPropertyId(propertyId);
            reviewsRepository.save(reviews);
        } else {
            throw new PropertiesNotFoundException("Объявление c id" + propertyId + "не найдено");

        }

    }

}
