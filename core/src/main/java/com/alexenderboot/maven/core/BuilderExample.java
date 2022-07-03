package com.alexenderboot.maven.core;

import lombok.Builder;
import lombok.Singular;
import lombok.ToString;

import java.util.Collections;
import java.util.Set;

@Builder
@ToString
public class BuilderExample {
    @Builder.Default private static long created = System.currentTimeMillis();
    private String name;
    private int age;
    @Singular private Set<String> occupations;
    public static BuilderExample run() {
        return new BuilderExample("obj", 9, Collections.singleton("Volgograd"));
    }
}