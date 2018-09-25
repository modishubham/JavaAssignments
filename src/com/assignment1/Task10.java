/*Write a single program for following operation using overloading
        A) Adding 2 integer number
        B) Adding 2 double
        C) multiplying 2 float
        D) multiplying 2 int
        E) concate 2 string
        F) Concate 3 String*/
package com.assignment1;

public class Task10 {
    public void add(int a,int b)
    {
        System.out.println(a+b);
    }
    public void add(double a,double b)
    {
        System.out.println(a+b);
    }
    public void multi(float a,float b)
    {
        System.out.println(a*b);
    }
    public void multi(int a,int b)
    {
        System.out.println(a*b);
    }
    public void concate(String a,String b)
    {
        System.out.println(a+b);
    }
    public void concate(String a,String b,String c)
    {
        System.out.println(a+b+c);
    }
    public static void main(String[] args) {
        Task10 obj = new Task10();
        obj.add(5,4);
        obj.add(4.5,6.5);
        obj.multi(6,6);
        obj.multi(1.2f,2.3f);
        obj.concate("shubham","modi");
        obj.concate("hello","java","programming");
    }
}
