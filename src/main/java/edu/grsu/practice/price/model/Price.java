package edu.grsu.practice.price.model;

import jakarta.persistence.Column;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "price")
public class Price {
    @EmbeddedId
    private PriceId id;
    @Column(name = "price")
    private int price;
}
