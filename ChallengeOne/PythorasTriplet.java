package ChallengeOne;

/**Given a number N (denoting one of the legs of the triangle), Print its Pythagoras pair in increasing order if they exist. Otherwise, print "-1".

Input Format
A single integer N

Constraints
N <= 10^9

Output Format
Two numbers X and Y denoting the rest of the numbers of the Pythagorean triplet in increasing order.

Sample Input
3
Sample Output
4 5 */

import java.util.Scanner;

public class PythorasTriplet {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // int arr[] = new int[100000];
        // int count = 1;
        // int i = 0;
        // int x = 1000000000;
        // while (Math.pow(count, 2) < x) {
        // arr[i] = (int) Math.pow(count, 2);
        // i++;
        // count++;
        // }
        int leg1 = sc.nextInt();
        sc.close();

        // boolean mila = false;
        // for (int m = 0; m < Math.pow(leg1, 2); m++) {
        // for (int n = 0; n < Math.pow(leg1, 2); n++) {
        // if (arr[m] == Math.pow(leg1, 2) + arr[n]) {
        // System.out.println((n + 1) + " " + (m + 1));
        // mila = true;
        // break;
        // }
        // }
        // if (mila)
        // break;
        // }

        int leg2 = 0;
        int hyp = 0;
        if (leg1 % 2 != 0) {
            int var = leg1 * leg1 + 1;
            leg2 = var / 2 - 1;
            hyp = var / 2;
        } else {
            int var = leg1 * leg1 / 4;
            leg2 = var - 1;
            hyp = var + 1;
        }
        if (leg1 < 3)
            System.out.println(leg2 + " " + hyp);
        else
            System.out.println(-1);
    }
}
