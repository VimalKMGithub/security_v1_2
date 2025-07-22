package org.vimal.security.v1.converter;

import jakarta.persistence.Converter;
import org.vimal.security.v1.util.aes.AESOperationType;
import org.vimal.security.v1.util.aes.factory.AESUtilFactory;

@Converter
public class CreatedByConverter extends AbstractConverter<String> {
    public CreatedByConverter(AESUtilFactory aesUtilFactory) {
        super(aesUtilFactory, AESOperationType.CREATED_BY);
    }

    @Override
    protected String toString(String attribute) {
        return attribute;
    }

    @Override
    protected String fromString(String dbData) {
        return dbData;
    }
}