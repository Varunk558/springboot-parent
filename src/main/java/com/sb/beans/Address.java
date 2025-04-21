package com.sb.beans;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Address {
    @Value("${addressLine1}")
    private String addressLine1;
    @Value("${addressLine2}")
    private String addressLine2;
    @Value("${zipCode}")
    private String zipCode;

    @Override
    public String toString() {
        return "Address{" +
                "addressLine1='" + addressLine1 + '\'' +
                ", addressLine2='" + addressLine2 + '\'' +
                ", zipCode='" + zipCode + '\'' +
                '}';
    }
}
