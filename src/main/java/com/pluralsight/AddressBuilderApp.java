package com.pluralsight;

import java.util.Scanner;

public class AddressBuilderApp {
    //created a static scanner
    public static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        //Initialize stringbuilder
        StringBuilder sb = new StringBuilder();

        System.out.println("Please provide the following information:");
        System.out.print("Full name: ");
        String fullName = scanner.nextLine().trim();

        // calling the buildAdress twice with a space in between
        String billing = buildAddress("Billing");
        System.out.println();// space between billing and shipping prompts
        String shipping = buildAddress("Shipping");

        // print the infromation
        System.out.println();
        System.out.println(fullName + "\n" + "Billing Address:");
        System.out.println(billing);
        System.out.println("\nShipping Address:" + "\n" + shipping);

    }
        // Method that handles bulling/shipping address and appends on the builder
        public static String buildAddress(String text){
            StringBuilder sb = new StringBuilder();

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

