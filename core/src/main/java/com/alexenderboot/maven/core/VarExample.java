package com.alexenderboot.maven.core;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;

import lombok.var;

public class VarExample {
    public static String example() {
        var foo = "Случайное число:";
        Random r = new Random();
        foo = foo + r.nextInt();
        return foo;
    }
}
