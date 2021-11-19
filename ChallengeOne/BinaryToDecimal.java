package ChallengeOne;

/**Take N (number in binary format). Write a function that converts it to decimal format and Print the value returned.

Input Format
Constraints
0 < N <= 1000000000

Output Format
Sample Input
101010
Sample Output
42
Explanation
For binary number fedcba , Decimal number = f * 25 + e * 24 + d * 23 + …..+ a * 20. */

import java.util.Scanner;

public class BinaryToDecimal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        sc.close();
        int decimal = 0;
        int i = 0;
        while (n != 0) {
            decimal += Math.pow(2, i) * (n % 10);
            n /= 10;
            i++;
        }
        System.out.println(decimal);
    }

}
