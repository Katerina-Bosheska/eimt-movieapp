package com.eimt.movierecommender.profilemanagement.domain.model;

import com.eimt.movierecommender.sharedkernel.domain.base.AbstractEntity;
import com.eimt.movierecommender.sharedkernel.domain.base.DomainObjectId;

import javax.persistence.AttributeOverride;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="profile_ratings")
public class Rating extends AbstractEntity<RatingId> {
    @Column
    @AttributeOverride(name="id",column = @Column(name="profile_id",nullable = false))
    private ProfileId profileId;
    @Column
    @AttributeOverride(name="id",column = @Column(name="movie_id",nullable = false))
    private MovieId movieId;
    @Column
    private double grade;

    public Rating(){}

    public Rating(ProfileId profileId, MovieId movieId, double grade) {
        super(DomainObjectId.randomId(RatingId.class));
        this.profileId = profileId;
        this.movieId = movieId;
        this.grade = grade;
    }

    public Rating(RatingId id, ProfileId profileId, MovieId movieId, double grade) {
        super(id);
        this.profileId = profileId;
        this.movieId = movieId;
        this.grade = grade;
    }
}
