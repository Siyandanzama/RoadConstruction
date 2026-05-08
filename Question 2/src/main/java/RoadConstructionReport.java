/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Siyanda
 */
public class RoadConstructionReport {

    public RoadConstructionReport(String city, int validAmount) {
    } 

    void printRoadsConstructedReport() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    int getTotalRoadsConstructed() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    Object getCity() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public class RoadReport extends RoadsConstructed {

    // Constructor
    public RoadReport(String city, int totalRoadsConstructed) {
        super(city, totalRoadsConstructed);
    }

    // Method to print the report
    public void printRoadsConstructedReport() {

        System.out.println("\nROAD CONSTRUCTION REPORT");
        System.out.println("***************************");

        System.out.println("CITY: " + getCity());
        System.out.println("ROADS CONSTRUCTED: " + getTotalRoadsConstructed());

        System.out.println("***************************");
    }
}
    
}
