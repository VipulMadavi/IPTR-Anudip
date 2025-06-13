import java.util.Scanner;

public class intPalindrome {
    public static void main(String[] args) {
        int reversedNum = 0, remainder;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter an integer: ");
        int num = sc.nextInt();
        int originalNum = num; // Store the original number
        while (num != 0) {
            remainder = num % 10; // Get the last digit
            reversedNum = reversedNum * 10 + remainder; // Build the reversed number
            num /= 10; // Remove the last digit from num
        }
        if (originalNum == reversedNum) {
            System.out.println(originalNum + " is a palindrome.");
        } else {
            System.out.println(originalNum + " is not a palindrome.");

        }
    }
}
