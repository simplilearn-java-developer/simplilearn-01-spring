package com.simplilearn.spring.dependency_injection._01_without_di;


interface Document{
	
	void print();
}

class Invoice implements Document{

	@Override
    public void print() {
        System.out.println("Printing the Invoice");
    }
}

class Quote implements Document{

	@Override
    public void print() {
        System.out.println("Printing the Quote");
    }
}

class Order implements Document{

	@Override
    public void print() {
        System.out.println("Printing the Order");
    }
}

class Printer{

    /*
     * The class printer doesn't depend on Invoice/Quote/Order
     */

	Document document; // Loose Coupling

	void setDocument(Document document) {
		this.document = document;
	}

    void print() {
        this.document.print();
    }

}

public class WithoutDIExample {

	public static void main(String[] args) {
		
		Invoice invoice = new Invoice(); 
		Quote quote = new Quote(); 
		Order order = new Order();
		
		Printer printer = new Printer();
		
		printer.setDocument(invoice); // Dependency Injection
		printer.print();
		
		printer.setDocument(quote); // Dependency Injection
		printer.print();

		printer.setDocument(order); // Dependency Injection
		printer.print();
		
	}
}
