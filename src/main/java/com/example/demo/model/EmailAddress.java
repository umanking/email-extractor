package com.example.demo.model;

/**
 * @author Andrew Han
 * @since 2019-10-03
 */
public class EmailAddress {

    private String value;

    public EmailAddress(String emailAddress) {
        this.value = emailAddress;
    }

    public EmailAddress() {
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "EmailAddress{" +
                "value='" + value + '\'' +
                '}';
    }
}
