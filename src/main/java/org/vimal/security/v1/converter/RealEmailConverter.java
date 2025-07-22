package org.vimal.security.v1.converter;

import jakarta.persistence.Converter;
import org.vimal.security.v1.util.aes.AESOperationType;
import org.vimal.security.v1.util.aes.factory.AESUtilFactory;

@Converter
public class RealEmailConverter extends AbstractConverter<String> {
    public RealEmailConverter(AESUtilFactory aesUtilFactory) {
        super(aesUtilFactory, AESOperationType.REAL_EMAIL);
    }

    @Override
    protected String toString(String attribute) {
        return attribute.toLowerCase();
    }

    @Override
    protected String fromString(String dbData) {
        return dbData;
    }
}