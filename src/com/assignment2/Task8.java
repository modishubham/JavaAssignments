//WAP to read words from the keyboard until the word done is entered. For each word except done, report whether its first character is equal   to  its last character. For the required loop, use a
//a)while statement
//b)do-while statement
package com.assignment2;

import java.util.Scanner;

public class Task8 {
    public static void main(String[] args) {
        String word;
        do {
            System.out.println("Enter any word and enter done for exit");
            Scanner sc = new Scanner(System.in);
            word = sc.nextLine();
            char arr[] = word.toCharArray();
            if(arr[0]==arr[arr.length-1]) {
                System.out.println("first and last character are equals");
            } else {
                System.out.println("first and last character are not equal");
            }
        } while (!word.equals("done"));
    }
}
