//Calculate the number & Percentage Of Lowercase Letters,Uppercase Letters, Digits And Other Special Characters In A String
package com.assignment1;

public class Task4 {
    public static void main (String args[]) {
        String data = "abB67@5bJS%lmN&&9";
        char arr[] = data.toCharArray();
        int i;
        int specialCharacter = 0;
        int lowerCase = 0;
        int upperCase = 0;
        int digit = 0;
        int length = arr.length;
        for(i = 0; i < length; i++) {
            if (Character.isLowerCase(arr[i])) {
                lowerCase++;
            } else if (Character.isUpperCase(arr[i])) {
                upperCase++;
            } else if (Character.isDigit(arr[i])) {
                digit++;
            } else {
                specialCharacter++;
            }
        }
        int scPercentage = (specialCharacter*100)/length;
        int lcPercentage = (lowerCase*100)/length;
        int ucPercentage = (upperCase*100)/length;
        int dPercentage = (digit*100)/length;
        System.out.println("Total lowercase - "+lowerCase+" Percentage - "+lcPercentage+"%");
        System.out.println("Total uppercase - "+upperCase+" Percentage - "+ucPercentage+"%");
        System.out.println("Total digit - "+digit+" Percentage - "+dPercentage+"%");
        System.out.println("Total special character - "+specialCharacter+" Percentage - "+scPercentage+"%");
    }
}
