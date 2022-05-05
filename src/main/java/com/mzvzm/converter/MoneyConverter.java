package com.mzvzm.converter;

import com.mzvzm.type.Money;
import jakarta.persistence.AttributeConverter;
import jakarta.persistence.Converter;

/**
 * @Author lilongsha
 * @Description
 * @Date 2022/5/3 10:57
 */
@Converter
public class MoneyConverter implements AttributeConverter<Money, Long> {
    @Override
    public Long convertToDatabaseColumn(Money attribute) {
        return attribute == null ? null : attribute.getCents();
    }

    @Override
    public Money convertToEntityAttribute(Long dbData) {
        return dbData == null ? null : new Money(dbData);
    }
}
