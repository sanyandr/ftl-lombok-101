package com.alexenderboot.maven.core;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class LogExampleOther {

    public static void run(String... args) {
        log.error("Something else is wrong here");
        System.out.println(2/0);
    }
}