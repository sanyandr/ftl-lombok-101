package com.alexenderboot.maven.console;

import com.alexenderboot.maven.core.*;

import javax.naming.NameNotFoundException;
import java.io.IOException;

public class App {
    public static void main(String[] args) throws IOException {
        //Lesson 2, val Example
        System.out.println(ValExample.example());
        ValExample.example2();
        //Lesson 3, var Example
        System.out.println(VarExample.example());

        //Lesson 4, tryin to make NULL object person -> got exception
        Person person = new Person();
        NonNullExample nonNull = new NonNullExample(person);
        System.out.println(nonNull);

        //Lesson 5, cleanup example
        //If there is all OK with files - no exceptions. If there are no such files - throws @cleanup exception
        String[] streams = new String[2];
        streams[0] = "/Users/aleksandrboot/Desktop/jb-101/ftl-lombok-101/console/src/main/java/com/alexenderboot/maven/console/inClean.txt";
        streams[1] = "/Users/aleksandrboot/Desktop/jb-101/ftl-lombok-101/console/src/main/java/com/alexenderboot/maven/console/outClean.txt";
        CleanupExample.run(streams);

        //Lesson 6, Getter & Setter
        GetterSetterExample gettersetterPerson = new GetterSetterExample();
        gettersetterPerson.setAge(10);
        //cannot set name cause setter is private: gettersetterPerson.setName
        System.out.println(gettersetterPerson.getAge());
    }
}
