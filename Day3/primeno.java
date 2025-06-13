
public class primeno {
    public static String isPrime(int n) {
        if (n == 1) {
            return "not prime";
        } else {
            for (int i = 2; i < n; i++) {
                if (n % i == 0) {
                    return "not prime";
                }
            }
            return "prime";
        }
    }

    public static void main(String[] args) {
        System.out.println(isPrime(6));
        System.out.println(isPrime(17));
    }
}
