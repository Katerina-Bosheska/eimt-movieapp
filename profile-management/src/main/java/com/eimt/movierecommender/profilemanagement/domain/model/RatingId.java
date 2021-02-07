package com.eimt.movierecommender.profilemanagement.domain.model;

import com.eimt.movierecommender.sharedkernel.domain.base.DomainObjectId;

import javax.persistence.Embeddable;
import java.io.Serializable;

@Embeddable
public class RatingId extends DomainObjectId implements Serializable {

    public RatingId(String id) {
        super(id);
    }

    public RatingId() {
        super(DomainObjectId.randomId(RatingId.class).toString());
    }
}