package com.alexenderboot.maven.core;

import lombok.extern.apachecommons.CommonsLog;
@CommonsLog(topic="CounterLog")
public class LogExampleCategory {

    public static void run(String... args) {
        log.error("Calling the 'CounterLog' with a message");
        System.out.println(2/0);
    }
}