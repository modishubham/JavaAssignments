// WAP to convert seconds into days, hours, minutes and seconds.
package com.assignment2;

public class Task7 {
    public void getTimes(int n) {
        int day = n / (24 * 3600);
        n = n % (24 * 3600);
        int hours = n / 3600;
        n %= 3600;
        int minutes = n / 60;
        n %= 60;
        int seconds = n;
        System.out.println("day- "+day+" hours- "+hours+" minutes- "+minutes+" seconds- "+seconds);
    }
    public static void main(String[] args) {
        Task7 obj = new Task7();
        obj.getTimes(4356844);

    }
}




