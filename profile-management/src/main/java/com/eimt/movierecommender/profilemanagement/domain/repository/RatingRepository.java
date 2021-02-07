package com.eimt.movierecommender.profilemanagement.domain.repository;

import com.eimt.movierecommender.profilemanagement.domain.model.MovieId;
import com.eimt.movierecommender.profilemanagement.domain.model.ProfileId;
import com.eimt.movierecommender.profilemanagement.domain.model.Rating;
import com.eimt.movierecommender.profilemanagement.domain.model.RatingId;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface RatingRepository extends JpaRepository<Rating, RatingId> {

    List<Rating> findAllByProfileId(ProfileId profileId);

    Rating findByMovieIdAndProfileId(MovieId movieId, ProfileId profileId);

}
