package com.eimt.movierecommender.profilemanagement.domain.model;

import com.eimt.movierecommender.sharedkernel.domain.base.AbstractEntity;
import com.eimt.movierecommender.sharedkernel.domain.base.DomainObjectId;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import lombok.Getter;

@Getter
@Entity
@Table(name="profiles")
public class Profile extends AbstractEntity<ProfileId> {
    @Column
    private String username;
    @Column
    private String bio;

    public Profile(){}

    public Profile(String username, String bio) {
        super(DomainObjectId.randomId(ProfileId.class));
        this.username = username;
        this.bio = bio;
    }

    public Profile(ProfileId id, String username, String bio) {
        super(id);
        this.username = username;
        this.bio = bio;
    }
}
