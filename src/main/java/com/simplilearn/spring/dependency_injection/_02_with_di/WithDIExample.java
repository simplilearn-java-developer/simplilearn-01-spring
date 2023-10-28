package com.simplilearn.spring.dependency_injection._02_with_di;


class Invoice{

    void print() {
        System.out.println("Printing the Invoice");
    }
}

class Quote{

    void print() {
        System.out.println("Printing the Quote");
    }
}

class Order{

    void print() {
        System.out.println("Printing the Order");
    }
}

class Printer{

    /*
     * The class printer depends on Invoice/Quote/Order
     */

    Invoice invoice = new Invoice(); // High/Tight Coupling

    Quote quote = new Quote();

    Order order = new Order();

    void printInvoice() {
        this.invoice.print();
    }

    void printQuote() {
        this.quote.print();
    }

    void printOrder() {
        this.order.print();
    }

}

public class WithDIExample {

}
