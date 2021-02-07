package com.eimt.movierecommender.moviecatalog.domain.model;

import com.eimt.movierecommender.sharedkernel.domain.base.AbstractEntity;
import com.eimt.movierecommender.sharedkernel.domain.base.DomainObjectId;
import lombok.Getter;

import javax.persistence.AttributeOverride;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Getter
@Entity
@Table(name="movie_features")
public class Feature extends AbstractEntity<FeatureId> {
    @Column
    private String genre;
    @Column
    private double quantity;
    @Column
    @AttributeOverride(name="id",column = @Column(name="movie_id",nullable = false))
    private MovieId movieId;

    public Feature(String genre, double quantity, MovieId movieId) {
        super(DomainObjectId.randomId(FeatureId.class));
        this.genre = genre;
        this.quantity = quantity;
        this.movieId = movieId;
    }

    public Feature(FeatureId id, String genre, double quantity, MovieId movieId) {
        super(id);
        this.genre = genre;
        this.quantity = quantity;
        this.movieId = movieId;
    }

    public Feature(){

    }
}
