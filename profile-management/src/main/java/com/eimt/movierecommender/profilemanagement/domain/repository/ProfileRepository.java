package com.eimt.movierecommender.profilemanagement.domain.repository;

import com.eimt.movierecommender.profilemanagement.domain.model.Profile;
import com.eimt.movierecommender.profilemanagement.domain.model.ProfileId;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProfileRepository extends JpaRepository<Profile, ProfileId> {
}
