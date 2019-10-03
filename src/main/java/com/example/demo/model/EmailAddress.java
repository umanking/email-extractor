package com.example.demo.model;

/**
 * @author Andrew Han
 * @since 2019-10-03
 */
public class EmailAddress {

    private String email;

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "EmailAddress{" +
                "email='" + email + '\'' +
                '}';
    }
}
