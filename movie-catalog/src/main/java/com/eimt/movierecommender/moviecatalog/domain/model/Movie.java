package com.eimt.movierecommender.moviecatalog.domain.model;

import com.eimt.movierecommender.sharedkernel.domain.base.AbstractEntity;
import com.eimt.movierecommender.sharedkernel.domain.base.DomainObjectId;
import lombok.Getter;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Getter
@Entity
@Table(name="movies")
public class Movie extends AbstractEntity<MovieId> {
    @Column
    private String title;
    @Column
    private String description;
    @Column
    private String director;
    @ElementCollection
    private List<String> cast;
    @Column
    private double rating;
    @Column
    private int viewers;

    public Movie(String title, String description, String director){
        super(DomainObjectId.randomId(MovieId.class));
        this.title = title;
        this.description = description;
        this.director = director;
        this.cast = new ArrayList<>();
        this.rating = 0.0;
        this.viewers = 0;
    }

    public Movie(String title, String description, String director, List<String> cast) {
        super(DomainObjectId.randomId(MovieId.class));
        this.title = title;
        this.description = description;
        this.director = director;
        this.cast = cast;
        this.rating = 0.0;
        this.viewers = 0;
    }

    public Movie(MovieId id, String title, String genre, String description, String director, List<String> cast) {
        super(id);
        this.title = title;
        this.description = description;
        this.director = director;
        this.cast = cast;
        this.rating = 0.0;
        this.viewers = 0;
    }

    public Movie() {
        this.cast = new ArrayList<>();
    }

    public void addToCast(String actor){
        this.cast.add(actor);
    }

    public void newRating(double grade){
        this.rating = (this.rating + grade)/viewers;
    }

    public void newView(){
        this.viewers++;
    }

}
