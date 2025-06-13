import java.util.Scanner;

class reverseNum {
    public static void main(String[] args) {
        int reversedNum = 0, remainder, x;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        x = sc.nextInt();
        while (x != 0) {
            remainder = x % 10;
            reversedNum = (reversedNum * 10) + remainder;
            x /= 10;
        }
        System.out.println(reversedNum);
    }
}