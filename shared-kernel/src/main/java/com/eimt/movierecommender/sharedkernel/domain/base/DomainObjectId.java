package com.eimt.movierecommender.sharedkernel.domain.base;

import lombok.Getter;
import org.springframework.lang.NonNull;

import javax.persistence.*;
import java.util.Objects;
import java.util.UUID;


@MappedSuperclass
@Getter
public class DomainObjectId implements ValueObject {

    @Column(length = 36)
    @GeneratedValue(strategy= GenerationType.AUTO)
    private final String id;

    public DomainObjectId(String id) {
        this.id = id;
    }

    /**
     * Creates a new, random instance of the given {@code idClass}.
     */
    @NonNull
    public static <ID extends DomainObjectId> ID randomId(@NonNull Class<ID> idClass) {
        Objects.requireNonNull(idClass, "idClass must not be null");
        try {
            return idClass.getConstructor(String.class).newInstance(UUID.randomUUID().toString());
        } catch (Exception ex) {
            throw new RuntimeException("Could not create new instance of " + idClass, ex);
        }
    }


}

