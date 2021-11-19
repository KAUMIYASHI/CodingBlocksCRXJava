
/*Take N as input. For a value of N=5, we wish to draw the following pattern :

                          5 4 3 2 1 0 1 2 3 4 5
                            4 3 2 1 0 1 2 3 4 
                              3 2 1 0 1 2 3 
                                2 1 0 1 2 
                                  1 0 1 
                                    0 
                                  1 0 1 
                                2 1 0 1 2 
                              3 2 1 0 1 2 3 
                            4 3 2 1 0 1 2 3 4 
                          5 4 3 2 1 0 1 2 3 4 5
Input Format
Take N as input.

Constraints
N <= 20

Output Format
Pattern should be printed with a space between every two values.

Sample Input
5
Sample Output
 5 4 3 2 1 0 1 2 3 4 5
   4 3 2 1 0 1 2 3 4 
     3 2 1 0 1 2 3 
       2 1 0 1 2 
         1 0 1 
           0 
         1 0 1 
       2 1 0 1 2 
     3 2 1 0 1 2 3 
   4 3 2 1 0 1 2 3 4 
 5 4 3 2 1 0 1 2 3 4 5 */
import java.util.Scanner;

public class PatternInvertedHourGlass {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();
        int nch = 2 * n + 1;
        int nsp = 0;
        int r = 1;
        int val = 0;
        while (r <= 2 * n + 1) {
            for (int i = 0; i < nsp; i++) {
                System.out.print("  ");
            }

            if (r <= n)
                val = n - r + 1;
            else if (r == n + 1)
                val = 0;
            else
                val = r - n - 1;
            for (int i = 1; i <= nch; i++) {
                System.out.print(val + " ");
                if (i <= nch / 2)
                    val--;
                else
                    val++;
            }
            r++;
            if (r <= n + 1) {
                nch -= 2;
                nsp++;
            } else {
                nch += 2;
                nsp--;
            }
            System.out.println();
        }

    }
}
