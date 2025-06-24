package edu.grsu.practice.price.service;

import edu.grsu.practice.price.dto.PriceDto;

public interface PriceService {
    public PriceDto getPrice (String from, String to);
}
