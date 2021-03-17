#!/bin/bash
touch Main.java
echo 'package com.A;
public class Main {
    public String getGreeting() {
        return "hello world!";
}

public static void main(String[] args) {
    System.out.println(new Main().getGreeting());
}
}' > Main.java
