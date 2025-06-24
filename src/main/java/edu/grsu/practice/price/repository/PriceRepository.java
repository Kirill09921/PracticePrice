package edu.grsu.practice.price.repository;

import edu.grsu.practice.price.model.Price;
import edu.grsu.practice.price.model.PriceId;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PriceRepository extends JpaRepository<Price, PriceId> {
}
