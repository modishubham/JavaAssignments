package com.assignment2;

public class MySingleton {
    private static MySingleton myObj;
    static {
        myObj = new MySingleton();
    }
    private MySingleton() {

    }
    public static MySingleton getInstance() {
        return myObj;
    }
    public void testMe() {
        System.out.println("This is singleton class example");
    }
    public static void main(String a[]) {
        MySingleton ms = getInstance();
        ms.testMe();
    }
}
