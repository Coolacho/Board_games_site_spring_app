package com.angel_angelov.board_games_site.data.product;

import jakarta.persistence.AttributeConverter;
import jakarta.persistence.Converter;

import java.util.stream.Stream;

@Converter(autoApply = true)
public class ProductTypeConverter implements AttributeConverter<ProductType, String> {

    @Override
    public String convertToDatabaseColumn(ProductType attribute) {
        if (attribute == null) return null;
        return attribute.getCode();
    }

    @Override
    public ProductType convertToEntityAttribute(String dbData) {
        if (dbData == null) return null;
        return Stream.of(ProductType.values())
                .filter(productType -> productType.getCode().equals(dbData))
                .findFirst()
                .orElseThrow(IllegalArgumentException::new);
    }
}
