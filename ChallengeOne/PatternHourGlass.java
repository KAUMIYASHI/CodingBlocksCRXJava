package ChallengeOne;

/*Take N as input. For a value of N=5, we wish to draw the following pattern :

             5                   5 
             5 4               4 5 
             5 4 3           3 4 5 
             5 4 3 2       2 3 4 5 
             5 4 3 2 1   1 2 3 4 5 
             5 4 3 2 1 0 1 2 3 4 5 
             5 4 3 2 1   1 2 3 4 5 
             5 4 3 2       2 3 4 5 
             5 4 3           3 4 5 
             5 4               4 5 
             5                   5 
Input Format
Take N as input.

Constraints
Output Format
Pattern should be printed with a space between every two values.

Sample Input
5
Sample Output
5                   5 
5 4               4 5 
5 4 3           3 4 5 
5 4 3 2       2 3 4 5 
5 4 3 2 1   1 2 3 4 5 
5 4 3 2 1 0 1 2 3 4 5 
5 4 3 2 1   1 2 3 4 5 
5 4 3 2       2 3 4 5 
5 4 3           3 4 5 
5 4               4 5 
5                   5  */
import java.util.Scanner;

public class PatternHourGlass {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();
        int r = 1;
        int nch = 1;
        int nsp = 2 * n;
        while (r <= 2 * n + 1) {
            int val = n;
            for (int i = 1; i <= nch; i++, val--) {
                System.out.print(val + " ");

            }
            for (int i = 0; i < nsp - 1; i++) {
                if (r != n + 1)
                    System.out.print("  ");
                else
                    System.out.print(" ");
            }

            val++;

            if (r == n + 1) {
                nch--;
                val++;
            }

            for (int i = 1; i <= nch; i++, val++) {
                System.out.print(val + " ");
            }

            if (r == n + 1)
                nch++;

            if (r <= n) {
                nsp -= 2;
                nch++;
            } else {
                nsp += 2;
                nch--;
            }

            System.out.println();
            r++;
        }

    }
}
