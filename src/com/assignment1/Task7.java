// Write a program to print your Firstname,LastName & age using static block,static method & static variable respectively
package com.assignment1;

public class Task7 {
    static int age = 23;
    static {
        System.out.println("Firstname- Shubham");
    }
    public static String getLastName() {
        return "Modi";
    }
}

class Main {
    public static void main(String[] args) {
        System.out.println("Lastname- "+ Task7.getLastName());
        System.out.println("age- "+ Task7.age);
    }
}
