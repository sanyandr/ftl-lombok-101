package com.alexenderboot.maven.core;

import lombok.extern.java.Log;

@Log
public class LogExample {

    public static void run(String... args) {
        log.severe("Something's wrong here");
        System.out.println(2/0);
    }
}





