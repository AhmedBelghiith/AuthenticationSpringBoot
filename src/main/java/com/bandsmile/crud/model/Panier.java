package com.bandsmile.crud.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;

@Entity
@Table(name = "Panier")
public class Panier {
    @Id
    @GeneratedValue
    private Long id;

    @Column(name = "totalePanier",nullable = false)
    private Double totalePanier;


}
