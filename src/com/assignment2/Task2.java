// WAP to sorting string without using string Methods?.

package com.assignment2;

public class Task2 {
    public static void main(String[] args) {
        String data = "javaprogramming";
        char temp;
        char arr[] = data.toCharArray();
        for (int i = 0; i < arr.length; i++) {
            for(int j = i+1; j<arr.length; j++) {
                if (arr[i] > arr[j]) {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        String result = new String(arr);
        System.out.println(result);
    }
}
