import java.util.Scanner;

public class PrintReverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        sc.close();
        long sum = 0;
        while (n > 0) {
            sum = sum * 10 + n % 10;
            n /= 10;
        }
        System.out.println(sum);

    }

}
