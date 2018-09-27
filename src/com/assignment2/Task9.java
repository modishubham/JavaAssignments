// Design classes having attributes for furniture where there are wooden chairs and tables, metal chairs and tables. There are stress and fire tests for each products.
package com.assignment2;

class Chair {
    int price;
    String brandName;
    String type;

    public Chair() {}

    public Chair (int price, String brandName, String type) {
        this.price = price;
        this.brandName = brandName;
        this.type = type;
    }

    public String getType() {
        return type;
    }
}

class Table extends Chair {
    int tablePrice;
    String tableBrandName;
    String tableType;

    public Table (int tablePrice, String tableBrandName, String tableType) {
        this.tablePrice = tablePrice;
        this.tableBrandName = tableBrandName;
        this.tableType = tableType;
    }

    public String getTableType() {
        return tableType;
    }
}


public class Task9 {

    public void testFire(Chair furniture) {
        if(furniture.getType().equals("wood")) {
            System.out.println("stress test pass");
        } else if(furniture.getType().equals("metal")) {
            System.out.println("stress test fail");
        } else {
            System.out.println("not found");
        }
    }

    public void testStress(Table furniture) {
        if(furniture.getTableType().equals("wood")) {
            System.out.println("fire test fail");
        } else if(furniture.getTableType().equals("metal")) {
            System.out.println("fire test pass");
        } else {
            System.out.println("not found");
        }
    }

    public static void main(String[] args) {
        Table obj1 = new Table(500,"lowbrand","wood");
        Table obj2 = new Table(1000,"highbrand","metal");
        Chair obj3 = new Chair(100,"highbrand","wood");
        Chair obj4 = new Chair(50,"lowbrand","metal");
        Task9 ts = new Task9();
        ts.testStress(obj1);
        ts.testStress(obj2);
        ts.testFire(obj3);
        ts.testFire(obj4);
    }
}
