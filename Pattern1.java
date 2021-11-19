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
