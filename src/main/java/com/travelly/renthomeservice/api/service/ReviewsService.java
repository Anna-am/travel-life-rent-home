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
    private final PropertiesRepository propertiesRepository;

    @Transactional
    public void saveReviews(UUID propertyId, ReviewsDtoRequest reviewsDtoRequest) {
        if (propertiesRepository.existsById(propertyId)) {
            log.info("Объявление c ID: {} найдено в бд rh_properties", propertyId);
            final Reviews reviews = reviewsMapper.convertToEntity(reviewsDtoRequest);
            reviews.setCreatedAt(Timestamp.valueOf(LocalDateTime.now()));
            reviews.setPropertyId(propertyId);
            final Reviews savedReviews = reviewsRepository.save(reviews);
            log.info("Отзыв c ID: {} добавлен к объявлению с ID: {}", savedReviews.getId(), propertyId);
        } else {
            throw new PropertiesNotFoundException("Объявление c id" + propertyId + "не найдено");

        }

    }

}
