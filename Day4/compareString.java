import java.util.Scanner;

public class compareString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 1st String: ");
        String s1 = sc.nextLine();
        System.out.println("Enter 2nd String: ");
        String s2 = sc.nextLine();
        if (s1.compareTo(s2) == 0) {
            System.out.println("Strings are Same!!!!");

        } else {
            System.out.println("Strings are not Same..!!!");
        }
    }
}