package edu.grsu.practice.price.model;

import jakarta.persistence.Embeddable;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Embeddable
public class PriceId {
    private String departureLocation;
    private String arrivalLocation;
}
