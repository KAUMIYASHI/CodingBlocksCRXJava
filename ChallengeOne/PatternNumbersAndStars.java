package ChallengeOne;

/**Take as input N, a number. Print the pattern as given in output section for corresponding input.

Input Format
Enter value of N

Constraints
Output Format
All numbers and stars are Space separated

Sample Input
5
Sample Output
1 2 3 4 5
1 2 3 4 * 
1 2 3 * * *
1 2 * * * * *
1 * * * * * * *
Explanation
Catch the pattern for the corresponding input and print them accordingly. */
import java.util.Scanner;

public class PatternNumbersAndStars {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();
        int star = 1;
        for (int i = 1; i <= n; i++) {
            int val = 1;
            for (int j = 0; j <= n - i; j++) {
                System.out.print(val + " ");
                val++;
            }

            if (i > 1) {
                for (int j = 0; j < star; j++) {
                    System.out.print("* ");
                }
                star += 2;
            }

            System.out.println();
        }
    }

}
