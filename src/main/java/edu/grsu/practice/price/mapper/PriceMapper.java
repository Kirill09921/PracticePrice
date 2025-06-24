package edu.grsu.practice.price.mapper;

import edu.grsu.practice.price.dto.PriceDto;
import edu.grsu.practice.price.model.Price;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingConstants;

@Mapper(componentModel = MappingConstants.ComponentModel.SPRING)
public interface PriceMapper {

    @Mapping(source = "id.departureLocation", target = "departureLocation")
    @Mapping(source = "id.arrivalLocation", target = "arrivalLocation")
    PriceDto toDto (Price price);

}
