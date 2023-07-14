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

    public ReviewsDtoRequest convertToDto(Reviews reviews) {
        return modelMapper.map(reviews, ReviewsDtoRequest.class);
    }
}
