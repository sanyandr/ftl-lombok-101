package com.alexenderboot.maven.console;

import com.alexenderboot.maven.core.Person;

public class App {
    public static void main(String[] args) {
        Person person = new Person();
        person.setFirstName("SASHATEST");
        System.out.println(person.getFirstName());
    }
}
