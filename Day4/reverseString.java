
/*
public class reverseString {
    public static void main(String[] args) {
        String s = "Hello";
        String reverse = "";
        for (int i = s.length() - 1; i >= 0; i--) {
            reverse = reverse + s.charAt(i);
        }
        System.out.println(reverse);

    }
}
*/

/*Reverse the String using Two Pointer Approach */
import java.util.Scanner;

public class reverseString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String s = sc.nextLine();

        StringBuilder sb = new StringBuilder(s);
        int front = 0;
        int back = sb.length() - 1;
        for (int i = 0; i < sb.length() / 2; i++) { // loop will run till half of the string
            char frontChar = sb.charAt(front); // takes the character at front value index and storing in the frontchar
            char backChar = sb.charAt(back); // takes the character at back value index and storing in the backchar
            sb.setCharAt(front, backChar); // set the character at the front index to the character at the back index
            sb.setCharAt(back, frontChar); // set the char at the back index to the character at the front index
            front++; // increments the front index
            back--; // decrements the back index
        }
        System.out.println(sb);
    }
}