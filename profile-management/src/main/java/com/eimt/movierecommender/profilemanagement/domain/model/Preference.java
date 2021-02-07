package com.eimt.movierecommender.profilemanagement.domain.model;

import com.eimt.movierecommender.sharedkernel.domain.base.AbstractEntity;
import com.eimt.movierecommender.sharedkernel.domain.base.DomainObjectId;

import javax.persistence.AttributeOverride;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="profile_preferences")
public class Preference extends AbstractEntity<PreferenceId> {
    @Column
    private String genre;
    @Column
    private double quantity;
    @Column
    @AttributeOverride(name="id",column = @Column(name="profile_id",nullable = false))
    private ProfileId profileId;
    @Column
    @AttributeOverride(name="id",column = @Column(name="movie_id",nullable = false))
    private MovieId movieId;

    public Preference(){}

    public Preference(ProfileId profileId, MovieId movieId, String genre, double quantity) {
        super(DomainObjectId.randomId(PreferenceId.class));
        this.genre = genre;
        this.quantity = quantity;
        this.profileId = profileId;
        this.movieId = movieId;
    }

    public Preference(PreferenceId id, ProfileId profileId, MovieId movieId, String genre, double quantity) {
        super(id);
        this.genre = genre;
        this.quantity = quantity;
        this.profileId = profileId;
        this.movieId = movieId;
    }
}
