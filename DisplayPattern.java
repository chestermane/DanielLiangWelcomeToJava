/*
 * Write a program that displays the following pattern.
 * Lesson 1.3
 */

/**
 *
 * @author Evan
 */
public class DisplayPattern {

    public static void main(String[] args) {
        char[] pattern = {'J', 'A', 'V', 'A'};

        System.out.println("    J\t A   V     V   A\n    J   A A   V   V   "
                + "A A\nJ   J  AAAAA   V V   AAAAA" + "\n J J  A     A   V   A"
                + "     A\n");

        //Printing JAVA from elements in pattern array.
        for (int i = 0; i < 1; i++) {
            char temp = pattern[i];
            System.out.printf("%5c%5c%4c%6c%4c\n%5c%4c%2c%4c%4c%4c%2c\n%1c%4c"
                    + "%3c%1c%1c%1c%1c%4c%2c%4c%1c%1c%1c%1c\n%2c%2c%3c%6c%4c%4c"
                    + "%6c\n",
                    pattern[0], pattern[1], pattern[2], pattern[2], pattern[3],
                    pattern[0], pattern[1], pattern[1], pattern[2], pattern[2],
                    pattern[3], pattern[3], pattern[0], pattern[0], pattern[1],
                    pattern[1], pattern[1], pattern[1], pattern[1], pattern[2],
                    pattern[2], pattern[3], pattern[3], pattern[3], pattern[3],
                    pattern[3], pattern[0], pattern[0], pattern[1], pattern[1],
                    pattern[2], pattern[3], pattern[3]);

        }

    }
}
