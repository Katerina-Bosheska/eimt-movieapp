package com.eimt.movierecommender.moviecatalog.web;

import com.eimt.movierecommender.moviecatalog.domain.model.Movie;
import com.eimt.movierecommender.moviecatalog.domain.model.MovieId;
import com.eimt.movierecommender.moviecatalog.service.MovieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController()
@RequestMapping("movies")
public class MovieController {

    @Autowired
    private MovieService movieService;

    @GetMapping("/add")
    public void addMovie(){
        Movie movie = new Movie("title1", "description", "director");
        movieService.addMovie(movie);
    }

    @GetMapping
    public List<Movie> getAllMovies(){
        return movieService.getAll();
    }

    @GetMapping("/addfeature")
    public void addFeature(){
        movieService.addFeature("1814683a-0dd3-4440-96b2-003823918167", "genre2", 3.7);
    }
}
