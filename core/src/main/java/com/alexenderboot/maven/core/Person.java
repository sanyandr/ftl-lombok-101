package com.alexenderboot.maven.core;

import lombok.Getter;
import lombok.Setter;

@Getter //Getter & Setter are working
@Setter
public class Person {
    private String firstName;
    private String lastName;

    @Override
    public String toString() {
        return "Person{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                '}';
    }
}
