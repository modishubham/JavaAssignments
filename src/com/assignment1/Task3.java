//Write a program to find the number of occurrences of a character in a string without using loop?
package com.assignment1;

import java.util.Scanner;

public class Task3 {
    public static void main(String args[]) {
        String data = "this is example of java programming";
        int length = data.length();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any character to find occurence");
        String ch = sc.nextLine();
        data = data.replace(ch,"");
        int length2 = data.length();
        int occ = length-length2;
        System.out.println(ch+" occurs "+occ+" times");
    }
}
