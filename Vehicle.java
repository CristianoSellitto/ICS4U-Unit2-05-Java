/*
* This class creates a vehicle
*
* @author  Cristiano Sellitto
* @version 1.0
* @since   2024-03-28
*/

/**
 * This is the class.
*/
public class Vehicle {
    /**
     * Test.
     *
     * @param 
    */
    private String licensePlateNumber = "";
    private String colour = "";
    private int doors = 0;
    private double speed = 0;
    private double maxSpeed = 0;

    /**
     * Creates the base vehicle.
     *
     * @param startColour the base colour
     * @param startPlateNumber the base license plate number
     * @param startDoors the number of doors
     * @param startMaxSpeed the maximum speed of the car
    */
    public Vehicle(
            String startColour, String startPlateNumber, int startDoors,
            double startMaxSpeed
    ) {
        this.licensePlateNumber = startPlateNumber;
        this.colour = startColour;
        this.doors = startDoors;
        this.maxSpeed = startMaxSpeed;
    }

    /**
     * Gets the license plate number of the vehicle.
     *
     * @return the current licensePlateNumber
    */
    public String getLicensePlateNumber() {
        return this.licensePlateNumber;
    }

    /**
     * Gets the colour of the vehicle.
     *
     * @return the current colour
    */
    public String getColour() {
        return this.colour;
    }

    /**
     * Gets the number of doors on the vehicle.
     *
     * @return the number of doors
    */
    public int getDoors() {
        return this.doors;
    }

    /**
     * Gets the speed of the vehicle.
     *
     * @return the current speed
    */
    public double getSpeed() {
        return this.speed;
    }

    /**
     * Gets the maximum speed of the vehicle.
     *
     * @return the maximum speed
    */
    public double getMaxSpeed() {
        return this.maxSpeed;
    }

    /**
     * Creates a string about the status of the vehicle.
     *
     * @return the string about the vehicle's status
    */
    public String getStatus() {
        String status = " -> Speed: " + this.speed + "\n";
        status += " -> MaxSpeed: " + this.maxSpeed + "\n";
        status += " -> Number of doors: " + this.doors + "\n";
        status += " -> License Plate: " + this.licensePlateNumber + "\n";
        status += " -> Color: " + this.colour + "\n";

        return status;
    }

    /**
     * Sets the colour of the vehicle.
     *
     * @param newColour of the vehicle
    */
    public void setColour(String newColour) {
        this.colour = newColour;
    }

    /**
     * Sets the license plate of the vehicle.
     *
     * @param newPlateNumber of the vehicle.
    */
    public void setLicensePlateNumber(String newPlateNumber) {
        this.licensePlateNumber = newPlateNumber;
    }

    /**
     * Accelerates the vehicle, which changes the speed.
     *
     * @param accelPower power of the acceleration
     * @param accelTime time of the acceleration
    */
    public void accelerate(double accelPower, double accelTime) {
        this.speed = (accelPower * accelTime) + this.speed;
        if (this.speed > this.maxSpeed) {
            this.speed = this.maxSpeed;
        }
    }

    /**
     * Brakes the vehicle, which changes speed.
     *
     * @param brakePower power of the brake
     * @param brakeTime time of the brake
    */
    public void brake(double brakePower, double brakeTime) {
        this.speed = this.speed - (brakePower * brakeTime);
        if (this.speed < 0) {
            this.speed = 0;
        }
    }
}
