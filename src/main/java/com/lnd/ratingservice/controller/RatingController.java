package com.lnd.ratingservice.controller;

import com.lnd.ratingservice.domain.Rating;
import com.lnd.ratingservice.service.RatingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class RatingController {
    @Autowired
    RatingService ratingService;
    @GetMapping("ratings")
    public ResponseEntity<List<Rating>> getRatings() {
       return ResponseEntity.ok(ratingService.getRatings());
    }
    @GetMapping("ratings/{ratingId}")
    public ResponseEntity<Rating> getRating(@PathVariable Integer ratingId) {
        return ResponseEntity.ok(ratingService.getRating(ratingId));
    }

    @PostMapping("ratings")
    public ResponseEntity<Rating> saveRating(@RequestBody Rating rating) {
        return ResponseEntity.status(HttpStatus.CREATED).body(rating);
    }

    @GetMapping("ratings/hotel/{hotelId}")
    public ResponseEntity<List<Rating>> getHotelRatings(@PathVariable Integer hotelId) {
        return ResponseEntity.ok(ratingService.getRatingsByHotel(hotelId));
    }

    @GetMapping("ratings/user/{userId}")
    public ResponseEntity<List<Rating>> getUserRatings(@PathVariable Integer userId) {
        return ResponseEntity.ok(ratingService.getRatingsByHotel(userId));
    }

}
