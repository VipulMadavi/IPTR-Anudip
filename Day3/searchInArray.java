import java.util.Scanner;

public class searchInArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int size = sc.nextInt();
        int[] numbers = new int[size]; // datatype[] arrayName = new datatype[size];
        System.out.println("Enter the numbers: ");
        for (int i = 0; i < numbers.length; i++) {

            numbers[i] = sc.nextInt();
        }
        System.out.println("Enter number to search: ");
        int search = sc.nextInt();
        boolean found = false;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == search) {
                System.out.println("Number found at index " + i);
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("Number not found"); // Prints only once
        }
    }
}

/*
 * public class searchInArray {
 * public static void main(String[] args) {
 * Scanner sc = new Scanner(System.in);
 * System.out.print("Enter the size: ");
 * int size = sc.nextInt();
 * int[] numbers = new int[size];
 * System.out.print("Enter the numbers: ");
 * for (int i = 0; i < size; i++) {
 * numbers[i] = sc.nextInt();
 * }
 * System.out.print("Enter the number to search: ");
 * int search = sc.nextInt();
 * for (int i = 0; i < size; i++) {
 * if (numbers[i] == search) {
 * System.out.print("Element found at " + i);
 * }
 * }
 * }
 * }
 */