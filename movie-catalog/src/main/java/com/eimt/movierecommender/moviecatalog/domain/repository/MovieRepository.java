package com.eimt.movierecommender.moviecatalog.domain.repository;

import com.eimt.movierecommender.moviecatalog.domain.model.Movie;
import com.eimt.movierecommender.moviecatalog.domain.model.MovieId;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MovieRepository extends JpaRepository<Movie, MovieId> {
}
