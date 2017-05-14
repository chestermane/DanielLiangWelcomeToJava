/*
 * 1.4 (Print a table) Write a program that displays the following table:
 * a a^2 a^3 
 * 1 1   1 
 * 2 4   8
 * 3 9   27 
 * 4 16  64
 *
 */
package printtable;
/*
 * Author Evan Chesterman
 */
public class PrintTable {

    public static void main(String[] args) {
        String[][] table = new String[5][3];
        table[0][0] = "a";
        table[0][1] = "a^2";
        table[0][2] = "a^3";
        table[1][0] = "1";
        table[1][1] = "1";
        table[1][2] = "1";
        table[2][0] = "2";
        table[2][1] = "4";
        table[2][2] = "8";
        table[3][0] = "3";
        table[3][1] = "9";
        table[3][2] = "27";
        table[4][0] = "4";
        table[4][1] = "16";
        table[4][2] = "64";

        System.out.printf("%10s%12s%10s\n%10s%10s%10s\n%10s%10s%10s\n"
                + "%10s%10s%10s\n%10s%10s%10s\n", table[0][0], table[0][1],
                table[0][2], table[1][0], table[1][1], table[1][2], table[2][0],
                table[2][1], table[2][2], table[3][0], table[3][1], table[3][2],
                table[4][0], table[4][1], table[4][2]);
    }

}
