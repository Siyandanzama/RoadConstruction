/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.propertymodel;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Siyanda
 */
public class PropertyModel {
    // Public attributes as specified in the property model requirement
    public String PropertyId;
    public String PropertyAddress;
    public double PropertyRentalAmount;
    public String AgentName;

    // Constructor to initialize a new property object
    public PropertyModel(String id, String address, double amount, String agent) {
        this.PropertyId = id;
        this.PropertyAddress = address;
        this.PropertyRentalAmount = amount;
        this.AgentName = agent;
    }
     // Memory collection to store property objects during runtime
    private static final ArrayList<PropertyModel> inventory = new ArrayList<>();
    private static final Scanner input = new Scanner(System.in);
    
    public static void main(String[] args) {
        // Initial application launch screen
        System.out.println("PROPERTY RENTALS - 2025");
        System.out.println("***********************************");
        System.out.print("Enter (1) to launch menu or any other key to exit: ");
        
        String start = input.nextLine();
        if (start.equals("1")) {
            displayMenu();
        } else {
            exitPropertyApplication();
        }
    }

    
    //Displays the main menu structure.
     
    public static void displayMenu() {
        while (true) {
            System.out.println("\nPlease select one of the following menu items:");
            System.out.println("(1) Enter new property.");
            System.out.println("(2) Search for property.");
            System.out.println("(3) Update property.");
            System.out.println("(4) Delete a property.");
            System.out.println("(5) Print property report - 2025");
            System.out.println("(6) Exit Application.");
            
            String choice = input.nextLine();
            switch (choice) {
                case "1": enterProperty(); break;
                case "2": searchProperty(); break;
                case "3": updateProperty(); break;
                case "4": deleteProperty(); break;
                case "5": propertyRentalReport(); break;
                case "6": exitPropertyApplication(); return;
                default: System.out.println("Invalid selection.");
            }
            
            // Re-prompt after every action as per Sample Screenshots
            System.out.print("\nEnter (1) to launch menu or any other key to exit: ");
            if (!input.nextLine().equals("1")) exitPropertyApplication();
        }
    }

    
    //Captures property details and saves to memory.
     
    public static void enterProperty() {
        System.out.println("\nENTER A NEW PROPERTY FOR RENTAL");
        System.out.println("*******************************");
        System.out.print("Enter the property id: ");
        String id = input.nextLine();
        System.out.print("Enter the property address: ");
        String address = input.nextLine();
        
        // Call validation method for the rental amount
        double amount = propertyAmountValidation();
        
        System.out.print("Enter the property agent: ");
        String agent = input.nextLine();
        
        // Save the validated data into the ArrayList
        inventory.add(new PropertyModel(id, address, amount, agent));
        System.out.println("New property processed successfully!!!");
    }

   
      //Validates that amount is numeric and >= R1500.
     
    public static double propertyAmountValidation() {
        while (true) {
            System.out.print("Enter the property rental price per month: ");
            String val = input.nextLine();
            try {
                double amount = Double.parseDouble(val);
                if (amount >= 1500) {
                    return amount; // Valid input
                } else {
                    System.out.println("You have entered an invalid amount!!! Amount must be >= R1500.");
                }
            } catch (NumberFormatException e) {
                // Handles non-numeric input
                System.out.println("You have entered an invalid amount!!! Only numbers are allowed.");
            }
            System.out.print("Please re-enter the property rental amount >> ");
        }
    }

    
    //Searches the memory collection for a specific ID.
    
    public static void searchProperty() {
        System.out.print("\nEnter the property id to search: ");
        String id = input.nextLine();
        
        for (PropertyModel p : inventory) {
            if (p.PropertyId.equals(id)) {
                printPropertyDetails(p); // If found, display details
                return;
            }
        }
        // If the loop finishes without returning, property was not found
        System.out.println("-----------------------------------");
        System.out.println("Rental property with property Id: " + id + " was not found!");
    }

    
    //Section 1.6: Updates an existing property in memory.
     
    public static void updateProperty() {
        System.out.print("\nEnter the property id to update: ");
        String id = input.nextLine();
        
        for (PropertyModel p : inventory) {
            if (p.PropertyId.equals(id)) {
                System.out.print("Enter the property address: ");
                p.PropertyAddress = input.nextLine();
                // Reuse validation logic for the update
                p.PropertyRentalAmount = propertyAmountValidation();
                System.out.print("Enter the property agent: ");
                p.AgentName = input.nextLine();
                return;
            }
        }
        System.out.println("Property not found.");
    }

    
    //Deletes a property after user confirmation.
    
    public static void deleteProperty() {
        System.out.print("\nEnter the property id to delete: ");
        String id = input.nextLine();
        
        for (int i = 0; i < inventory.size(); i++) {
            if (inventory.get(i).PropertyId.equals(id)) {
                // Mandatory confirmation step
                System.out.print("Are you sure you want to delete property " + id + " from the system? Yes (y) to delete: ");
                if (input.nextLine().equalsIgnoreCase("y")) {
                    inventory.remove(i); // Remove from memory
                    System.out.println("-----------------------------------");
                    System.out.println("Property with Property Id: " + id + " WAS deleted!");
                }
                return;
            }
        }
    }

    
   //Generates a report of all properties in memory.
    
    public static void propertyRentalReport() {
        if (inventory.isEmpty()) {
            System.out.println("No properties found in the system.");
            return;
        }
        for (int i = 0; i < inventory.size(); i++) {
            System.out.println("\nProperty " + (i + 1));
            printPropertyDetails(inventory.get(i));
        }
    }

    
    //Formats property output according to screenshots.
    
    private static void printPropertyDetails(PropertyModel p) {
        System.out.println("-----------------------------------");
        System.out.println("PROPERTY ID: " + p.PropertyId);
        System.out.println("PROPERTY ADDRESS: " + p.PropertyAddress);
        System.out.println("PROPERTY RENTAL AMOUNT: R" + p.PropertyRentalAmount);
        System.out.println("PROPERTY AGENT: " + p.AgentName);
        System.out.println("-----------------------------------");
    }

    
    //Exits the application.
     
    public static void exitPropertyApplication() {
        System.out.println("Exiting Application...");
        System.exit(0);
    }
}


    

