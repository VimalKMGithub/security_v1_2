package org.vimal.security.v1.converter;

import jakarta.persistence.Converter;
import org.vimal.security.v1.util.aes.AESOperationType;
import org.vimal.security.v1.util.aes.factory.AESUtilFactory;

@Converter
public class PasswordConverter extends AbstractConverter<String> {
    public PasswordConverter(AESUtilFactory aesUtilFactory) {
        super(aesUtilFactory, AESOperationType.PASSWORD_SECRET);
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