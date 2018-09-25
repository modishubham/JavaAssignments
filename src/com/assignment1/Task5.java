//Find common elements between two arrays.
package com.assignment1;

public class Task5 {
    public static void main(String args[]) {
        String arr1[] = {"apple","mango","banana","orange","pineapple"};
        String arr2[] = {"pumpkin","apple","guava","orange","mango","egg"};
        int arr1Length = arr1.length;
        int arr2Length = arr2.length;
        int i,j;
        System.out.println("Common elements are -");
        for(i=0;i<arr1Length;i++) {
            for(j=0;j<arr2Length;j++) {
                if(arr1[i]==arr2[j]) {
                    System.out.println(arr1[i]);
                }
            }
        }
    }
}
