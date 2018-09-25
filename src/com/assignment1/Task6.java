//There is an array with every element repeated twice except one. Find that element
package com.assignment1;

public class Task6 {
    public static void main(String args[]) {
        int arr[] = {1,2,3,5,6,1,3,2,6};
        int length = arr.length;
        int flag = 0;
        for(int i=0; i<length; i++) {
            for(int j=0; j<length; j++) {
                if(i != j) {
                    if(arr[i] != arr[j]) {
                        flag = 1;
                    } else {
                        flag = 0;
                        break;
                    }
                }
            }
            if(flag == 1) {
                System.out.print("Element occur only one time is - "+arr[i]);
            }
        }
    }
}
