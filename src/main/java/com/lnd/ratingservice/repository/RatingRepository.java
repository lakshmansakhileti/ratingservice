package com.lnd.ratingservice.repository;

import com.lnd.ratingservice.domain.Rating;
import org.springframework.data.domain.Example;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface  RatingRepository extends JpaRepository<Rating, Integer> {
   List<Rating> findAllRatingsByHotelId(Integer hotelId);

    List<Rating> findAllRatingsByUserId(Integer userId);

}
