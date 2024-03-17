package fr.uga.l3miage.tp1.exo3.models;

import javax.persistence.*;
import java.util.Set;

@Entity
public class FederationEntity {
    @Id
    private String name;

    private Boolean isFageMembership;

    @OneToMany(mappedBy="name")
    private Set<AssociationEntity> associations_entities;
}
