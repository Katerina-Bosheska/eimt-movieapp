package com.eimt.movierecommender.moviecatalog.domain.repository;

import com.eimt.movierecommender.moviecatalog.domain.model.Feature;
import com.eimt.movierecommender.moviecatalog.domain.model.FeatureId;
import com.eimt.movierecommender.moviecatalog.domain.model.MovieId;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface FeatureRepository extends JpaRepository<Feature, FeatureId> {

    List<Feature> findAllByMovieId(MovieId movieId);

    List<Feature> findAllByGenre(String genre);
}
