package com.pluralsight;

import java.util.Scanner;

public class AddressBuilderApp {
    //created a static scanner
    public static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        //initialize the string builder

        //Initialize stringbuilder
        StringBuilder sb = new StringBuilder();

        System.out.println("Please provide the following information:");
        System.out.print("Full name: ");
        String fullName = scanner.nextLine().trim();


//        //space for readability
//        System.out.println();
//
//        // ask user for their shipping information and store it in a variable.
//        System.out.print("Shipping Street: ");
//        String shippingStreet = scanner.nextLine().trim();
//
//        System.out.print("Shipping City: ");
//        String ShippingStreet = scanner.nextLine().trim();
//
//        System.out.print("Shipping State: ");
//        String shippingState = scanner.nextLine().trim();
//
//        System.out.print("Shipping State: ");
//        String shippingZip = scanner.nextLine().trim();


//        sb.append(fullName).append("\n");
//
//        sb.append("Billing Address:\n");
//        sb.append(billingStreet).append("\n");
//        sb.append(billingCity).append(", ")
//                .append(billingState).append(" ")
//                .append(billingZip).append("\n");

        //print a space
        System.out.println();
        // print the information from the stringbuilder

        String billing = buildAddress("Billing");
        System.out.println(billing);

    }
        // Method that handles bulling/shipping address and appends on the builder
        public static String buildAddress(String text){
            StringBuilder sb = new StringBuilder();
            System.out.println( text + " Address");

            //ask user for thei billing address
            System.out.print( text + " Street: ");
            String street = scanner.nextLine().trim();

            //ask user for their billing city
            System.out.print( text + " City: ");
            String city = scanner.nextLine().trim();

            //ask user for their state
            System.out.print(text + " State: ");
            String state = scanner.nextLine().trim();

            //ask user for their zip.
            System.out.print(text + " Zip: ");
            String Zip = scanner.nextLine().trim();

            sb.append(street).append("\n")
                    .append(city).append(", ")
                    .append(state).append(" ")
                    .append(Zip);

            return sb.toString();
        }



    }

