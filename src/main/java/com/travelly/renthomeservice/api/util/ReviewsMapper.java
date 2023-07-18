package com.travelly.renthomeservice.api.util;

import com.travelly.renthomeservice.api.dto.ReviewsDtoRequest;
import com.travelly.renthomeservice.entity.Reviews;
import lombok.AllArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class ReviewsMapper {

    private final ModelMapper modelMapper;

    public Reviews convertToEntity(ReviewsDtoRequest reviewsDtoRequest, Class<Reviews> reviewsClass) {
        return modelMapper.map(reviewsDtoRequest, Reviews.class);
    }
}
