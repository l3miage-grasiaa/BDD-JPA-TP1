package fr.uga.l3miage.tp1.exo3.models;

import javax.persistence.*;

@Entity
@Table(name="product_entity")
public class ProductEntity {
    @Id
    @Column(name="bar_code_number", length=15)
    private String bar_code_number;

    private String name;

    private Boolean consumable;

    @OneToMany(mappedBy="bar_code_number")
    private BrandEntity brand_entity;
}
