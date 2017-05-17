/*
(Population projection) The U.S. Census Bureau projects population based on the
following assumptions:
■ One birth every 7 seconds
■ One death every 13 seconds
■ One new immigrant every 45 seconds
Write a program to display the population for each of the next five years.
Assume the current population is 312,032,486 and one year has 365 days. Hint: 
In Java, if two integers perform division, the result is an integer. The 
fractional part is truncated. For example, 5 / 4 is 1 (not 1.25) and 10 / 4 is 
2 (not 2.5). To get an accurate result with the fractional part, one of the
values involved in the division must be a
 */
package javaapplication1;

/**
 *
 * @author Evan
 */
public class JavaApplication1 {

    public static void main(String[] args) {
        double currentPopulation = 312032;
        double secondsInDay = 86400;
        double birth = (secondsInDay / 7.0);
        double death = (secondsInDay / 13.0);
        double immigrant = (secondsInDay / 45.0);

        for (int i = 1; i < 6; i++) {
            currentPopulation = currentPopulation + birth + immigrant - death;
            System.out.println("The population for year " + i + " is " + currentPopulation);
        }

    }

}
