//Write a program to display values of enums using a constructor & getPrice() method (Example display house & their prices)
package com.assignment1;

enum House {
    TWOBHK(3200000),THREEBHK(5000000),FOURBHK(7000000);
    private int price;
    House(int p) {
        price = p;
    }
    int getPrice() {
        return price;
    }
}

public class Task9 {
    public static void main(String[] args) {
        System.out.println("All house price");
        for(House h : House.values()) {
            System.out.println(h+" "+h.getPrice());
        }
    }
}
