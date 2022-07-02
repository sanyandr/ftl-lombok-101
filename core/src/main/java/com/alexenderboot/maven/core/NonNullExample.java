package com.alexenderboot.maven.core;
import lombok.NonNull;

public class NonNullExample {
    private String name;

    public NonNullExample(@NonNull Person person) {
        this.name = person.getName();
    }
}

