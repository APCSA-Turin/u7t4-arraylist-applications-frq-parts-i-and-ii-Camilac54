package com.example.project.Airport;
import java.util.ArrayList;
import java.util.Arrays;

public class testairport {
    public static void main(String[] args) {
        Flight f0 = new Flight(25, 50.00, 30);
        Flight f1 = new Flight(10, 100.50, 60);
        Flight f2 = new Flight(20, 100.00, 120);
        Flight f3 = new Flight(50, 200.00, 40);
        ArrayList<Flight> allFlights = new ArrayList<Flight>(Arrays.asList(f0, f1, f2, f3));
        Airport capitalHub = new Airport(allFlights);
        int passengersWithRemovedFlights = capitalHub.updateFlights();
        System.out.println(passengersWithRemovedFlights);
    }
}
