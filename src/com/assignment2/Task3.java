package com.assignment2;

public class Task3 {
    public static void main(String[] args) {
        try {
            Class loadClass = Class.forName("Example");
        } catch (ClassNotFoundException e) {
            System.out.println("Class not found"+e);
        }
        Test obj = new Test();
        obj.show();
    }
}

// after compiling remove Test.class for generating NoClassDefFoundError
class Test {
    void show() {
        System.out.println("test class");
    }
}