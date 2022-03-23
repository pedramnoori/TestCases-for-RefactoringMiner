package com.company;

public class Main {

    public static void main(String[] args) {
    }

    void printOwing() {

        Enumeration e = _orders.elements();
        double outstanding = 0.0;

        extracted();

        while (e.hasMoreElements()) {
            Order each = (Order) e.nextElement();
            outstanding += each.getAmount();
        }

        System.out.println ("name:" + _name);
        System.out.println ("amount" + outstanding);
    }

    private void extractedMethodTwo() {
        System.out.println ("**************************");
        System.out.println ("***** Customer Owes ******");
        System.out.println ("**************************");
        System.out.println ("--------------------------");

    }
}
