package com.eimt.movierecommender.profilemanagement.domain.model;

import com.eimt.movierecommender.sharedkernel.domain.base.DomainObjectId;

import javax.persistence.Embeddable;
import java.io.Serializable;

@Embeddable
public class PreferenceId extends DomainObjectId implements Serializable {

    public PreferenceId(String id) {
        super(id);
    }

    public PreferenceId() {
        super(DomainObjectId.randomId(MovieId.class).toString());
    }
}
