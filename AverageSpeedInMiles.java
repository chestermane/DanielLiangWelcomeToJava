/*
 * 1.10 (Average speed in miles) Assume a runner runs 14 kilometers
 * in 45 minutes and 30 seconds. Write a program that displays 
 * the average speed in miles per hour. (Note that 1 mile is 1.6 kilometers.)
 */
package averagespeedinmiles;

/**
 *
 * @author Evan
 */
public class AverageSpeedInMiles {

    public static void main(String[] args) {
        double kiloToMiles = 14 / 1.609344;
        double speed = kiloToMiles * 60 / 45.5;

        System.out.println("The runners average speed is: " + speed
                + " miles an hour");

    }

}
