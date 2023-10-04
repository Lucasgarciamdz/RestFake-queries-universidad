package com.um.restfake.repositories;


import com.um.restfake.entities.Rating;
import org.springframework.stereotype.Repository;

@Repository
public interface RatingRepository extends BaseRepository<Rating, Long> {
}
