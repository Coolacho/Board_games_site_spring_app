package com.angel_angelov.board_games_site.data.order;

import jakarta.persistence.AttributeConverter;
import jakarta.persistence.Converter;

import java.util.stream.Stream;

@Converter(autoApply = true)
public class OrderStatusConverter implements AttributeConverter<OrderStatus, String> {
    @Override
    public String convertToDatabaseColumn(OrderStatus attribute) {
        if (attribute == null) return null;
        return attribute.getCode();
    }

    @Override
    public OrderStatus convertToEntityAttribute(String dbData) {
        if (dbData == null) return null;
        return Stream.of(OrderStatus.values())
                .filter(orderStatus -> orderStatus.getCode().equals(dbData))
                .findFirst()
                .orElseThrow(IllegalArgumentException::new);    }
}
