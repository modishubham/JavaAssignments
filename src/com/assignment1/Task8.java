//Write a program to reverse a string and remove character from index 4 to index 9 from the reversed string using String Buffer
package com.assignment1;

public class Task8 {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("WelcomeToJavaProgramming");
        sb.reverse();
        System.out.println("String after reverse- "+sb);
        sb.replace(4,9,"");
        System.out.println("String after removing character from 4 to 9 index- "+sb);
    }
}
