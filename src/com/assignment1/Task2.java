//Write a program to find the number of occurrences of the duplicate words in a string and print them ?
package com.assignment1;

public class Task2 {
    public static void main(String args[]) {
        int count = 0,i,j;
        String data = "hello this this is java java programming";
        String arr[] = data.split(" ");
        for(i=0;i<arr.length;i++) {
            for(j=i+1;j<arr.length;j++) {
                if(arr[i].equals(arr[j])){
                    count ++;
                }
            }
            if(count>0) {
                System.out.println(arr[i]);
            }
            count = 0;
        }
    }
}
