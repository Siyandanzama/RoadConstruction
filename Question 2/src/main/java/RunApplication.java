/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Siyanda
 */import java.util.Scanner;
public class RunApplication {
     public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // User input
        System.out.print("Enter the city for road construction: ");
        String city = input.nextLine();

        System.out.print("Enter the total road construction for "
                + city + ": ");
        int roads = input.nextInt();

        // Create object
        RoadConstructionReport report =
                new RoadConstructionReport(city, roads);

        // Display report
        report.printRoadsConstructedReport();

        input.close();
    }
}
    

