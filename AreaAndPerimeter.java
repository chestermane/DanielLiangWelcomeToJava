/*
 * 1.8 (Area and perimeter of a circle) Write a program that displays the area 
 * and perimeter of a circle that has a radius of 5.5 using the following
 * formula: perimeter = 2 * radius * pi
 * area = radius * radius * pi.
 */
package areaandperimeter;

/**
 *
 * @author Evan
 */
public class AreaAndPerimeter {

    public static void main(String[] args) {
        final double PI = 3.14159;
        final double RADIUS = 5.5;
        double perimeter = 2 * RADIUS * PI;
        double area = RADIUS * RADIUS * PI;

        System.out.println("Your circle perimeter is: " + perimeter
                + " your circle area is: " + area);

    }

}
