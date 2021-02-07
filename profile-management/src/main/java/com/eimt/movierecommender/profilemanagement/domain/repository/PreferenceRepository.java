package com.eimt.movierecommender.profilemanagement.domain.repository;

import com.eimt.movierecommender.profilemanagement.domain.model.Preference;
import com.eimt.movierecommender.profilemanagement.domain.model.PreferenceId;
import com.eimt.movierecommender.profilemanagement.domain.model.ProfileId;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PreferenceRepository extends JpaRepository<Preference, PreferenceId> {

    List<Preference> findAllByProfileIdAndGenre(ProfileId profileId, String genre);
}
