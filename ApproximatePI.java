/*
 * 1.7 (Approximatep) p can be computed using the following formula:
 * p = 4 * ¢1 - 1 + 1 - 1 + 1 - 1 + c ≤
 * Write a program that displays the result of 4 *
 * + 1 - 1 + 1 - 1 ≤
 * ≤. Use 1.0 instead of 1 in your
 * 111111 and 4 * ¢1 - +   -   +   -   +
 * ¢1 - 1
 * 3 5 7 9 11
 * 3 5 7 9 11 13
 */
package approximatepi;

/**
 *
 * @author Evan Chesterman
 */
public class ApproximatePI {

    public static void main(String[] args) {
        double pi = (4 * (1.0 - (1.0 / 3) + (1.0 / 5) - (1.0 / 7) + (1.0 / 9)
                - (1.0 / 11)));

        double piTwo = (4 * (1.0 - 1.0 / 3 + 1.0 / 5 - 1.0 / 7 + 1.0 / 9
                - 1.0 / 11 + 1.0 / 13));

        System.out.println(pi + "\n" + piTwo);

    }

}
