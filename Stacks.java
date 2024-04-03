/*
* This program uses a vehicle class to make three vehicles
*
* @author  Cristiano Sellitto
* @version 1.0
* @since   2024-04-03
*/

import java.util.Scanner;

/**
* This is the program.
*/
final class Stacks {
    /**
    * Prevent instantiation.
    * Throw an exception IllegalStateException.
    * if this is ever called
    *
    * @throws IllegalStateException if this is ever called
    *
    */
    private Stacks() {
        throw new IllegalStateException("Cannot be instantiated");
    }

    /**
    * The starting main() function.
    *
    * @param args No args will be used
    */
    public static void main(final String[] args) {
        // Add Ford Focus
        System.out.println("Created Ford focus");
        final Vehicle fordFocus = new Vehicle("white", "B40-C4RR0", 4, 284);

        // Change vehicle
        System.out.println(fordFocus.getStatus());
        System.out.println("Accelerating, 10 of power for 10 sec.");
        fordFocus.accelerate(10, 10);
        System.out.println("New speed: " + fordFocus.getSpeed());
        System.out.println("Changing colour to black:");
        fordFocus.setColour("black");
        System.out.println("New color: " + fordFocus.getColour() + "\n");

        // Show the program as done
        System.out.println("\nDone.");
    }
}
