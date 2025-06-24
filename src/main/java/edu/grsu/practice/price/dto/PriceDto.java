package edu.grsu.practice.price.dto;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Builder
public class PriceDto {
    private String departureLocation;
    private String arrivalLocation;
    private int price;
}
