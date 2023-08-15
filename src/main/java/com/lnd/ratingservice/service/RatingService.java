package com.lnd.ratingservice.service;

import com.lnd.ratingservice.domain.Rating;

import java.util.List;

public interface RatingService {

     Rating saveRating(Rating rating);
     List<Rating> getRatings();
    Rating getRating(Integer id);
    List<Rating> getRatingsByHotel(Integer hotelId );
    List<Rating> getRatingsByUser(Integer userId );


}
