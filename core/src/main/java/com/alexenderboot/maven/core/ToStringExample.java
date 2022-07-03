package com.alexenderboot.maven.core;
import lombok.Setter;
import lombok.ToString;

@Setter
@ToString
public class ToStringExample {
    private static final int STATIC_VAR = 10;
    private Shape shape = new Square(5, 10);
    @ToString.Exclude
    private int id;

    @ToString(callSuper = true, includeFieldNames = true)
    public static class Square extends Shape {
        private final int width, height;

        public Square(int width, int height) {
            this.width = width;
            this.height = height;
        }
    }
}
