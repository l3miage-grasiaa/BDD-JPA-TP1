package fr.uga.l3miage.tp1.exo3.models;

import fr.uga.l3miage.tp1.exo3.enums.AssociationType;

import javax.persistence.*;

@Entity
public class AssociationEntity {
    @Id
    private String name;

    @Column(nullable = false)
    private String president_name;

    @Column(nullable = false)
    private String treasure_name;

    private String secretary_name;

    @Enumerated(EnumType.STRING)
    private AssociationType association_type;

    @ManyToOne
    @JoinColumn(name="fk_name", referencedColumnName="name")
    private FederationEntity federation_entity;

}
