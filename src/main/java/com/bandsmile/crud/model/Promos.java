package com.bandsmile.crud.model;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;
import java.util.Collection;
import java.util.Date;

@Entity
@Table(name = "promos")
public class Promos {
    @Id
    @GeneratedValue
    private Long id;

    @NotEmpty
    @Column(name = "pourcentage")
    private Double pourcentage;

    @NotEmpty
    @Column(name = "dateDeb")
    private Date dateDeb;

    @NotEmpty
    @Column(name = "dateFin")
    private Date dateFin;

    public Promos(Long id, Double pourcentage, Date dateDeb, Date dateFin) {
        this.id = id;
        this.pourcentage = pourcentage;
        this.dateDeb = dateDeb;
        this.dateFin = dateFin;
    }

    public Promos() {

    }
}
