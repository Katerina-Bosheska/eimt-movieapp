package com.eimt.movierecommender.moviecatalog.domain.model;

import com.eimt.movierecommender.sharedkernel.domain.base.DomainObjectId;

import javax.persistence.Embeddable;
import java.io.Serializable;

@Embeddable
public class MovieId extends DomainObjectId implements Serializable {

    public MovieId(String id) {
        super(id);
    }

    public MovieId() {
        super(DomainObjectId.randomId(MovieId.class).toString());
    }
}
