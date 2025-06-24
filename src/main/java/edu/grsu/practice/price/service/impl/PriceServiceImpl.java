package edu.grsu.practice.price.service.impl;

import edu.grsu.practice.price.dto.PriceDto;
import edu.grsu.practice.price.mapper.PriceMapper;
import edu.grsu.practice.price.model.Price;
import edu.grsu.practice.price.model.PriceId;
import edu.grsu.practice.price.repository.PriceRepository;
import edu.grsu.practice.price.service.PriceService;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
@Slf4j
public class PriceServiceImpl implements PriceService {

    public PriceRepository priceRepository;
    public PriceMapper priceMapper;

    @Override
    public PriceDto getPrice(String from, String to) {
        log.info("getPrice {} - {}", from, to);
        PriceId id = new PriceId();
        id.setDepartureLocation(from);
        id.setArrivalLocation(to);
        Price price = priceRepository.findById(id).orElseThrow();
        return priceMapper.toDto(price);
    }
}
