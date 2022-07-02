package com.alexenderboot.maven.console;

import com.alexenderboot.maven.core.NonNullExample;
import com.alexenderboot.maven.core.Person;
import com.alexenderboot.maven.core.ValExample;
import com.alexenderboot.maven.core.VarExample;

import javax.naming.NameNotFoundException;

public class App {
    public static void main(String[] args) {
        //Lesson 2, val Example
        System.out.println(ValExample.example());
        ValExample.example2();
        //Lesson 3, var Example
        System.out.println(VarExample.example());

        //Lesson 4, tryin to make NULL object person -> got exception
        Person person = null;
        NonNullExample nonNull = new NonNullExample(person);
        System.out.println(nonNull);

        
    }
}
