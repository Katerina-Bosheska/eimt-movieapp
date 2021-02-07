package com.eimt.movierecommender.moviecatalog.service;

import com.eimt.movierecommender.moviecatalog.domain.model.Feature;
import com.eimt.movierecommender.moviecatalog.domain.model.Movie;
import com.eimt.movierecommender.moviecatalog.domain.model.MovieId;
import com.eimt.movierecommender.moviecatalog.domain.repository.FeatureRepository;
import com.eimt.movierecommender.moviecatalog.domain.repository.MovieRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class MovieService {

    @Autowired
    private MovieRepository movieRepository;
    @Autowired
    private FeatureRepository featureRepository;

    public Movie addMovie(Movie movie){
        return movieRepository.save(movie);
    }

    public List<Movie> getAll(){
        return movieRepository.findAll();
    }

    public void addFeature(String id, String genre, double quantity) {
        MovieId movieId = new MovieId(id);
        Feature feature = new Feature(genre, quantity, movieId);
        featureRepository.save(feature);
    }

}
