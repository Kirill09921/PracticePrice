package edu.grsu.practice.price.controller;

import edu.grsu.practice.price.dto.PriceDto;
import edu.grsu.practice.price.service.PriceService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@AllArgsConstructor
@RestController
@RequestMapping("/api/price")
public class PriceController {
    private PriceService priceService;

    @GetMapping("/{from}/{where}")
    public PriceDto getPrice(@PathVariable String from, @PathVariable String where) {
        return priceService.getPrice(from, where);
    }
}
