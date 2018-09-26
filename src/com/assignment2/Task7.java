package com.assignment2;

public class Task7 {
    public void getTimes(int seconds) {
        double minutes = seconds/60;
        double hours = minutes/60;
        double day = hours/24;
        System.out.println("day- "+day+" hours- "+hours+" minutes- "+minutes+" seconds- "+seconds);
    }
    public static void main(String[] args) {
        Task7 obj = new Task7();
        obj.getTimes(7200);

    }
}


