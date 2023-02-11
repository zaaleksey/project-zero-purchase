package com.qwerty.project.projectzero.model.purchase;

import jakarta.persistence.AttributeConverter;
import jakarta.persistence.Converter;

import java.util.stream.Stream;

@Converter(autoApply = true)
public class PurchaseTypeConverter implements AttributeConverter<PurchaseType, Integer> {

    @Override
    public Integer convertToDatabaseColumn(PurchaseType type) {
        if (type == null) {
            return null;
        }

        return type.getCode();
    }

    @Override
    public PurchaseType convertToEntityAttribute(Integer code) {
        if (code == null) {
            return null;
        }

        return Stream.of(PurchaseType.values())
                .filter(c -> c.getCode() == code)
                .findFirst()
                .orElse(PurchaseType.UNKNOWN);
    }

}
