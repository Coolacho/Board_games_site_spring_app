package com.angel_angelov.board_games_site.data.order;

import jakarta.persistence.AttributeConverter;
import jakarta.persistence.Converter;

import java.util.stream.Stream;

@Converter(autoApply = true)
public class OrderPaymentMethodConverter implements AttributeConverter<OrderPaymentMethod, String> {

    @Override
    public String convertToDatabaseColumn(OrderPaymentMethod attribute) {
        if (attribute == null) return null;
        return attribute.getCode();
    }

    @Override
    public OrderPaymentMethod convertToEntityAttribute(String dbData) {        if (dbData == null) return null;
        return Stream.of(OrderPaymentMethod.values())
                .filter(orderPaymentMethod -> orderPaymentMethod.getCode().equals(dbData))
                .findFirst()
                .orElseThrow(IllegalArgumentException::new);
    }
}
