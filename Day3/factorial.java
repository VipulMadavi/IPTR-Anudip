import java.util.Scanner;

public class factorial {
    public static int fact(int n) {
        if (n == 0) {
            return 1;
        } else if (n < 0) {
            return -1;
        } else {
            return n * fact(n - 1); // recursion
        }
    }

    public static int factIterative(int n) {
        if (n < 0) {
            return -1;
        }
        int result = 1;
        for (int i = 1; i <= n; i++) {
            result = result * i;
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a no: ");
        int n = sc.nextInt();

        System.out.println(fact(n));
        System.out.println(factIterative(n));
    }
}
