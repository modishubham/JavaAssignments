package com.assignment2;

interface Book {
    public void getBookDetails(String bookname);
}

final class Library {
    static String name = "ToTheNew Library";
    static String address = "Noida";
}

abstract class Books implements Book {
    abstract void getLibraryDetails();

    @Override
    public void getBookDetails(String bookname) {
        if(bookname.equals("math")) {
            System.out.println("Name - Math, Author- RK verma, Publish - 2002, Price - 500");
        }
        else if(bookname.equals("science")) {
            System.out.println("Name - Science, Author- NM singh, Publish - 2009, Price - 700");
        }
        else if(bookname.equals("english")) {
            System.out.println("Name - English, Author- AK verma, Publish - 2000, Price - 300");
        } else {
            System.out.println("no book found");
        }
    }
}

public class Task1 extends Books {
    @Override
    void getLibraryDetails() {
        System.out.println("Library Name - "+Library.name);
        System.out.println("Library Address - "+Library.address);
    }
    public static void main(String[] args) {
        Task1 obj = new Task1();
        obj.getLibraryDetails();
        System.out.println("Books details");
        obj.getBookDetails("math");
        obj.getBookDetails("english");
        obj.getBookDetails("science");
    }

}
