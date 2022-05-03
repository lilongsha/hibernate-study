package com.mzvzm.converter;

import com.mzvzm.entity.Gender;
import jakarta.persistence.AttributeConverter;
import jakarta.persistence.Converter;


/**
 * @Author lilongsha
 * @Description
 * @Date 2022/4/28 17:02
 */
@Converter
public class GenderConverter
        implements AttributeConverter<Gender, Character> {

    public Character convertToDatabaseColumn(Gender value) {
        if (value == null) {
            return null;
        }

        return value.getCode();
    }

    public Gender convertToEntityAttribute(Character value) {
        if (value == null) {
            return null;
        }

        return Gender.fromCode(value);
    }
}
