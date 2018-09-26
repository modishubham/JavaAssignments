package com.assignment2;

import java.util.Scanner;

public class Task13 {
    public static void main(String[] args) {
        System.out.println("Enter any number");
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        try {
            if (number > 9) {
                throw new Exception("hello");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

class MyException extends Exception {
    public MyException(String s) {
        super(s);
    }
}

