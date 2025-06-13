import java.util.Scanner;

public class Array {
    public static void main(String[] args) {
        int[] numbers = new int[5];
        // int[][] matrix = new int[4][5];
        for (int i = 0; i < numbers.length; i++) {
            System.out.println("Enter the number: ");
            Scanner sc = new Scanner(System.in);
            numbers[i] = sc.nextInt();
        }
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " ");
        }
    }
}
