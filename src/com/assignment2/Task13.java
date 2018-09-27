// Create a custom exception that do not have any stack trace.
package com.assignment2;

import java.util.Scanner;

public class Task13 {
    public static void main(String[] args) throws Exception {
        System.out.println("Enter any number");
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        if (number > 9) {
            throw new MyException("this is user defined exception",false);
        } else {
            System.out.println(number);
        }
    }
}

class MyException extends Exception {
    public MyException(String s, boolean suppressStacktrace) {
        super(s);
    }
}

