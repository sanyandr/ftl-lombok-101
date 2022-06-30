package com.alexenderboot.maven.console;

import com.alexenderboot.maven.core.ValExample;
import com.alexenderboot.maven.core.VarExample;

public class App {
    public static void main(String[] args) {
        System.out.println(ValExample.example());
        ValExample.example2();
        System.out.println(VarExample.example());
    }
}
