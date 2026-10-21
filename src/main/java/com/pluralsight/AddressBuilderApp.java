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
        System.out.print("Full name: ");
        String fullName = scanner.nextLine().trim();


        //ask user for thei billing address
        System.out.print("Billing Street: ");
        String billingStreet = scanner.nextLine().trim();

        //ask user for their billing city
        System.out.print("Billing City: ");
        String billingCity = scanner.nextLine().trim();

        //ask user for their state
        System.out.print("Billing State: ");
        String billingState = scanner.nextLine().trim();

        //ask user for their zip.
        System.out.print("Billing Zip: ");
        String billingZip = scanner.nextLine().trim();

        //space for readability
        System.out.println();

        // ask user for their shipping information and store it in a variable.
        System.out.print("Shipping Street: ");
        String shippingStreet = scanner.nextLine().trim();

        System.out.print("Shipping City: ");
        String ShippingStreet = scanner.nextLine().trim();

        System.out.print("Shipping State: ");
        String shippingState = scanner.nextLine().trim();

        System.out.print("Shipping State: ");
        String shippingZip = scanner.nextLine().trim();



        sb.append(fullName).append("\n");

        sb.append("Billing Address:\n");
        sb.append(billingStreet).append("\n");
        sb.append(billingCity).append(", ")
                .append(billingState).append(" ")
                .append(billingZip).append("\n");

        //print a space
        System.out.println();
        // print the information from the stringbuilder
        System.out.println(sb.toString());

    }
}
