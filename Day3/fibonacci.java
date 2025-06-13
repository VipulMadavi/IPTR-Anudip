public class fibonacci {
    public static int fib(int n) {
        if (n == 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        } else {
            int first = 0, second = 1, result = 0;
            for (int i = 1; i <= n; i++) {
                result = first + second;
                first = second;
                second = result;
            }
            return result;
        }
    }

    public static void main(String[] args) {
        int n = 7;
        for (int i = 0; i <= n; i++) {
            System.out.println(fib(i));
        }
    }
}
