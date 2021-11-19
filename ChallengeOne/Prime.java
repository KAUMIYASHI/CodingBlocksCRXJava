
import java.util.Scanner;

/*
Take as input a number N, print "Prime" if it is prime if not Print "Not Prime".

Input Format
Constraints
2 < N <= 1000000000

Output Format
Sample Input
3
Sample Output
Prime
Explanation
The output is case specific */
public class Prime {

    public static String isPrime(int n) {
        if (n < 1)
            return "Invalid";
        else if (n < 3)
            return "Prime";
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0)
                return "Not Prime";
        }
        return "Prime";
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();
        System.out.println(isPrime(n));
    }

}
