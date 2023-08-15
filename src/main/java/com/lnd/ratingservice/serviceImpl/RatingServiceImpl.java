package com.lnd.ratingservice.serviceImpl;

import com.lnd.ratingservice.domain.Rating;
import com.lnd.ratingservice.repository.RatingRepository;
import com.lnd.ratingservice.service.RatingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RatingServiceImpl implements RatingService {
    @Autowired
    RatingRepository repository;
    @Override
    public Rating saveRating(Rating rating) {
        return repository.save(rating);
    }

    @Override
    public List<Rating> getRatings() {
        return repository.findAll();
    }

    @Override
    public Rating getRating(Integer id) {
        return repository.getReferenceById(id);
    }

    @Override
    public List<Rating> getRatingsByHotel(Integer hotelId) {
        return repository.findAllRatingsByHotelId(hotelId);
    }

    @Override
    public List<Rating> getRatingsByUser(Integer userId) {
        return repository.findAllRatingsByUserId(userId);
    }
}
