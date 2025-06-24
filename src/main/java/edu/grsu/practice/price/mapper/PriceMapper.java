package edu.grsu.practice.price.mapper;

import edu.grsu.practice.price.dto.PriceDto;
import edu.grsu.practice.price.model.Price;
import org.mapstruct.Mapper;
import org.mapstruct.MappingConstants;

@Mapper(componentModel = MappingConstants.ComponentModel.SPRING)
public interface PriceMapper {
    PriceDto toDto (Price price);
}
