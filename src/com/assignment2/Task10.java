//10. Design classes having attributes and method(only skeleton) for a coffee shop. There are three different actors in our scenario and i have listed the different actions they do also below
//
//* Customer
//  - Pays the cash to the cashier and places his order, get a token number back
//  - Waits for the intimation that order for his token is ready
//  - Upon intimation/notification he collects the coffee and enjoys his drink
//  ( Assumption:  Customer waits till the coffee is done, he wont timeout and cancel the order. Customer always likes the drink served. Exceptions like he not liking his coffee, he getting wrong coffee are not considered to keep the design simple.)
//
//* Cashier
//  - Takes an order and payment from the customer
//  - Upon payment, creates an order and places it into the order queue
//  - Intimates the customer that he has to wait for his token and gives him his token
//  ( Assumption: Token returned to the customer is the order id. Order queue is unlimited. With a simple modification, we can design for a limited queue size)
//
//* Barista
// - Gets the next order from the queue
// - Prepares the coffee
// - Places the coffee in the completed order queue
// - Places a notification that order for token is ready
package com.assignment2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class CoffeeShop {
    String customername = "customer1";
    String customeraddress;
    String orderName;
    List<String> orderQueue = new ArrayList<>(Arrays.asList("order1","order2"));
    List<String> completedOrder = new ArrayList<>();

    public String placeOrderAndGetToken(int amount,String orderName) {
        //String tokenNumber = String.valueOf(Math.random()*100);
        String tokenNumber = "1005";
        if(amount==100 && orderName.equals("coffee")) {
            System.out.println("Customer order = coffee");
            System.out.println("Cashier get a order of "+orderName+" with amount -"+amount+"Rs");
            orderQueue.add(orderName);
            System.out.println("order added in queue "+orderQueue);
            System.out.println("token Number-"+tokenNumber);
            baristaGetOrder(orderQueue);
            return tokenNumber;
        } else if(amount == 50 && orderName.equals("cold drink")) {
            System.out.println("order = cold drink");
            System.out.println("Cashier get a order of "+orderName+" with amount -"+amount+"Rs");
            orderQueue.add(orderName);
            System.out.println("order added in queue "+orderQueue);
            System.out.println("token Number-"+tokenNumber);
            baristaGetOrder(orderQueue);
            return tokenNumber;
        }else{
            return "";
        }
    }

    public void baristaGetOrder(List<String> list) {
        int lastOrder = list.size();
        String orderName = list.get(lastOrder-1);
        System.out.println("Barista take the order from queue and prepare "+orderName);
        completedOrder.add(orderName);
        isOrderReady(completedOrder);
    }


    public void isOrderReady(List<String> list) {
        if(list.contains("coffee")) {
            System.out.println("Order of coffee is ready");
        } else if(list.contains("cold drink")) {
            System.out.println("Order of cold drink is ready");
        } else {
            System.out.println("Order not ready");
        }
    }

}

public class Task10 {
    public static void main(String[] args) {
        CoffeeShop obj = new CoffeeShop();
        String tokenNumber = obj.placeOrderAndGetToken(100,"coffee");
        if(tokenNumber != "") {
            System.out.println("Customer taking his order");
        } else {
            System.out.println("this order is not available");
        }
    }
}
