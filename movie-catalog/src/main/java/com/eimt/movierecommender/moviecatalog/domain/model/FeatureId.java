package com.eimt.movierecommender.moviecatalog.domain.model;

import com.eimt.movierecommender.sharedkernel.domain.base.DomainObjectId;

import javax.persistence.Embeddable;
import java.io.Serializable;

@Embeddable
public class FeatureId extends DomainObjectId implements Serializable {

    public FeatureId(String id) {
        super(id);
    }

    public FeatureId() {
        super(DomainObjectId.randomId(FeatureId.class).toString());
    }
}