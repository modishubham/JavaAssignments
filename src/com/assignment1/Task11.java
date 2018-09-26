//Create 3 sub class of bank SBI,BOI,ICICI all 4 should have method called getDetails which provide there specific details like rateofinterest etc,print details of every banks
package com.assignment1;

class Bank {
    public void getDetails() {
        System.out.println("There are three banks ICCI BOI & SBI");
    }
}
class ICICI extends Bank {
    public void getDetails() {
        System.out.println("ICICI rate of interest 8%");
    }
}
class SBI extends Bank {
    public void getDetails() {
        System.out.println("SBI rate of interest 7%");
    }
}
class BOI extends Bank {
    public void getDetails() {
        System.out.println("BOI rate of interest 6%");
    }
}

class Task11 {
    public static void main(String[] args) {
        Bank obj = new Bank();
        ICICI ob1 = new ICICI();
        SBI ob2 = new SBI();
        BOI ob3 = new BOI();
        obj.getDetails();
        ob1.getDetails();
        ob2.getDetails();
        ob3.getDetails();
    }
}
