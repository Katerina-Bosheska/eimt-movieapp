package com.eimt.movierecommender.profilemanagement.domain.model;

import com.eimt.movierecommender.sharedkernel.domain.base.DomainObjectId;

import javax.persistence.Embeddable;
import java.io.Serializable;

@Embeddable
public class ProfileId extends DomainObjectId implements Serializable {

    public ProfileId(String id) {
        super(id);
    }

    public ProfileId() {
        super(DomainObjectId.randomId(ProfileId.class).toString());
    }
}