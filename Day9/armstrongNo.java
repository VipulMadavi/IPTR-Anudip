import java.util.Scanner;

public class armstrongNo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int num = sc.nextInt();
        if (isarmstrong(num)) {
            System.out.println("Armstrong");
        } else {
            System.out.println("Not Armstrong");
        }
    }

    public static int order(int num) {
        int count = 0;
        while (num != 0) {
            num = num / 10;
            count++;
        }
        return count;
    }

    public static int power(int num) {
        int count = order(num);
        int sum = 0;
        while (num != 0) {
            int rem = num % 10;
            int power = 1;
            for (int i = 1; i <= count; i++) {
                power = power * rem;
            }
            sum = sum + power;
            num = num / 10;
        }
        return sum;
    }

    public static boolean isarmstrong(int num) {
        int sum = power(num);
        if (sum == num) {
            return true;
        } else {
            return false;
        }

    }
}
