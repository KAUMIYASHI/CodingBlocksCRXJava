import java.util.Scanner;

public class pascalTriangle {

    static int fact(int x) {
        if (x <= 1) {
            return 1;
        }
        return x * fact(x - 1);
    }

    static int combination(int n, int k) {
        int nfact = fact(n);
        int kfact = fact(k);
        int n_kfact = fact(n - k);
        // System.out.println((nfact / (kfact * n_kfact)) + " " + n + " " + k);
        return nfact / (kfact * n_kfact);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(combination(i, j));
                combination(i, j);
            }
            System.out.println();
        }
    }

}
