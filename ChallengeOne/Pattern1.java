/*Take N as input. For a value of N=7, we wish to draw the following pattern :

                            1 
                        2 1   1 2 
                    3 2 1       1 2 3 
                4 3 2 1           1 2 3 4 
                    3 2 1       1 2 3 
                        2 1   1 2 
                            1 
Input Format
Take N as input.

Constraints
N is odd number.

Output Format
Pattern should be printed with a space between every two values.

Sample Input
7
Sample Output
            1 
        2 1   1 2 
    3 2 1       1 2 3 
4 3 2 1           1 2 3 4 
    3 2 1       1 2 3 
        2 1   1 2 
            1 
Explanation
Catch the pattern and print it accordingly.*/

import java.util.*;

public class Pattern1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();
        int nsp = n - 1;

        int val = 1;
        int r = 1;
        int mnsp = -1;
        while (r <= n) {

            int csp = 1;
            while (csp <= nsp) {
                System.out.print("  ");
                csp++;
            }
            for (int i = val; i >= 1; i--) {
                System.out.print(i + " ");
            }
            csp = 1;

            if (val > 1)
                while (csp <= mnsp) {
                    System.out.print("  ");
                    csp++;
                }

            if (val == 1)
                for (int i = 1; i < val; i++) {
                    System.out.print(i + " ");
                }
            else
                for (int i = 1; i <= val; i++) {
                    System.out.print(i + " ");
                }

            if (r < n - n / 2) {
                nsp -= 2;
                mnsp += 2;
                val++;
            } else {
                nsp += 2;
                mnsp -= 2;
                val--;
            }
            r++;
            System.out.println();

        }
    }
}
