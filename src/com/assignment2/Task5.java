// WAP to show object cloning in java using cloneable and copy constructor both.

package com.assignment2;

class Data implements Cloneable {
    int data1,data2;
    Data(int d1,int d2) {
        data1 = d1;
        data2 = d2;
    }
    Data(Data obj) {
        data1 = obj.data1;
        data2 = obj.data2;
    }

    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    public void show() {
        System.out.println(data1+" "+data2);
    }
}

public class Task5 {
    public static void main(String[] args) throws CloneNotSupportedException {
        Data obj1 = new Data(10,11);
        Data obj2 = new Data(obj1);
        Data obj3 = (Data)obj1.clone();
        obj1.show();
        obj2.show();
        obj3.show();
    }
}
