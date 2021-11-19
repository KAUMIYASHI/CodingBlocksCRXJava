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
