package com.pluralsight;

import java.util.Scanner;

public class AddressBuilderApp {
    public static void main(String[] args) {
        //create a scanner
        Scanner scanner = new Scanner(System.in);
        //initialize the string builder

        //Initialize stringbuilder
        StringBuilder sb = new StringBuilder();

        System.out.println("Please provide the following information:");

        //ask user for thei billing address
        System.out.print("Billing Street: ");
        String billingStreet = scanner.nextLine();

        //ask user for their billing city
        System.out.print("Billing City: ");
        String billingCity = scanner.nextLine();

        //ask user for their state
        System.out.print("Billing State: ");
        String billingState = scanner.nextLine();

        //ask user for their zip
        System.out.print("Billing Zip: ");
        String billingZip = scanner.nextLine();;

        //space for readability
        System.out.println();

        // ask user for their shipping information and store it in a variable
        System.out.print("Shipping Street: ");
        String shippingStreet = scanner.nextLine();

        System.out.print("Shipping City: ");
        String ShippingStreet = scanner.nextLine();

        System.out.print("Billing State: ");
        String shippingState = scanner.nextLine();

    }
}
