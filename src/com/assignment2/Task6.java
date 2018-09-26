package com.assignment2;

public class Task6 {
    public static void main(String[] args) {
        int number1,number2;
        int arr[] = {1,2,3,4,5};
        try {
            number1 = 25;
            number2 = number1/0;
            System.out.println(arr[7]);
        } catch (ArithmeticException e) {
            System.out.println("can not devide by zero "+e);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array index is greater than its length "+e);
        } catch (Exception e) {
            System.out.println("Exception -"+e);
        }
        finally {
            System.out.println("finally block always execute");
        }
    }
}
