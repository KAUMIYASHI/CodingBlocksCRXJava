
import java.util.Scanner;

public class PatternWithZeroes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                if ((j == 0 || j == i) && i > 0)
                    System.out.print(i + 1 + "\t");
                else {
                    if (i != 0)
                        System.out.print(0 + "\t");
                    else
                        System.out.print(1 + "\t");
                }
            }
            System.out.println();
        }
    }

}
