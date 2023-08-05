/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package vehicle;
import java.util.Scanner;

/**
 *
 * @author User
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Vehicle[] vehicles = new Vehicle[4];
        vehicles[0] = new Car("CAR001", "Toyota", "Corolla", 80, 4);
        vehicles[1] = new Car("CAR002", "Honda", "Civic", 90, 2);
        vehicles[2] = new Motorcycle("MOTO001", "Yamaha", "YZF-R6", 70, 600);
        vehicles[3] = new Motorcycle("MOTO002", "Kawasaki", "Ninja 400", 60, 400);

        int rentalDays;

        // Prompt user for the number of rental days
        System.out.print("Enter the number of rental days: ");
        rentalDays = scanner.nextInt();

        for (Vehicle vehicle : vehicles) {
            System.out.println("\nVehicle Details:\n" + vehicle.toString());
            System.out.println("Rental Cost for " + rentalDays + " days: RM " + vehicle.calculateRentalCost(rentalDays));

            if (vehicle instanceof Motorcycle) {
                Motorcycle motorcycle = (Motorcycle) vehicle;
                System.out.println("Top Speed: " + motorcycle.calculateTopSpeed() + " km/h");
            }
        }

        scanner.close();
    }
}