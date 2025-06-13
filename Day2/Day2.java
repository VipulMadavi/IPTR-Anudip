import java.util.Scanner;
/*
 * 
 * public class Day2 {
 * public static void main(String[] args) {
 * for (int i = 0; i < 10; i++) {
 * System.out.println("Iteration:- " + i);
 * }
 * }
 * }
 * 
 * 
 * public class Day2 {
 * public static void main(String[] args0) {
 * int i = 1;
 * while (i < 10) {
 * System.out.println("Iteration:- " + i);
 * i++;
 * }
 * }
 * }
 * 
 * 
 * public class Day2 {
 * public static void main(String[] args) {
 * for (int i = 1; i <= 10; i++) {
 * System.out.println("2" + " x " + i + " = " + (2 * i));
 * }
 * }
 * }
 * 
 * 
 * public class Day2 {
 * public static void main(String[] args) {
 * Scanner sc = new Scanner(System.in);
 * System.out.print("Enter a number: ");
 * int num = sc.nextInt();
 * for (int i = 1; i <= num; i++) {
 * 
 * if (i % 2 == 0) {
 * System.out.println(i + " is Even ");
 * } else {
 * System.out.println(i + " is Odd");
 * }
 * }
 * }
 * }
 * 
 * 
 * 
 * public class Day2 {
 * public static void main(String[] args) {
 * int i = 1;
 * while (i <= 5) {
 * System.out.println("Iteration:- " + i);
 * i++;
 * }
 * }
 * }
 * 
 * 
 * public class Day2 {
 * public static void main(String[] args) {
 * int i = 1;
 * while (i <= 10) {
 * System.out.println("2" + " x " + i + " = " + (2 * i));
 * i++;
 * }
 * }
 * }
 * 
 * 
 * 
 * public class Day2 {
 * public static void main(String[] args) {
 * int i = 1;
 * do {
 * System.out.println(i);
 * i++;
 * } while (i <= 5);
 * }
 * }
 * 
 * 
 * 
 * public class Day2 {
 * public static void main(String[] args) {
 * Scanner sc = new Scanner(System.in);
 * System.out.print("Enter a number: ");
 * int num = sc.nextInt();
 * int sum = 0;
 * for (int i = 1; i <= num; i++) {
 * sum += i;
 * }
 * System.out.println(sum);
 * }
 * }
 * 
 * 
 * 
 * public class Day2 {
 * public static void main(String[] args) {
 * Scanner sc = new Scanner(System.in);
 * System.out.print("Enter a number: ");
 * int num = sc.nextInt();
 * int sum = 0;
 * 
 * do {
 * sum += num;
 * num--;
 * } while (num > 0);
 * 
 * System.out.println(sum);
 * }
 * }
 * 
 * 
 * public class Day2 {
 * public static void main(String[] args) {
 * for (int i = 1; i <= 4; i++) {
 * for (int j = 1; j <= 4; j++) {
 * System.out.print("* ");
 * }
 * System.out.println();
 * }
 * }
 * }
 * 
 * 
 * 
 * public class Day2 {
 * public static void main(String[] args) {
 * for (int i = 1; i <= 5; i++) {
 * for (int j = 1; j <= i; j++) {
 * System.out.print("* ");
 * }
 * System.out.println();
 * }
 * }
 * }
 * 
 * 
 * public class Day2 {
 * public static void main(String[] args) {
 * for (int i = 1; i <= 5; i++) {
 * for (int j = 1; j <= 5 - i; j++) {
 * System.out.print(" ");
 * }
 * for (int k = 1; k <= (2 * i - 1); k++) {
 * System.out.print("*");
 * }
 * 
 * System.out.println();
 * }
 * }
 * }
 * 
 * 
 * 
 * //make star hollow sqaure
 * 
 * public class Day2 {
 * public static void main(String[] args) {
 * for (int row = 1; row <= 4; row++) {
 * for (int column = 1; column <= 4; column++) {
 * if (row == 1 || row == 4 || column == 1 || column == 4) {
 * System.out.print("* ");
 * } else {
 * System.out.print("  ");
 * }
 * }
 * System.out.println();
 * }
 * }
 * }
 * 
 * // Make a pattern of numbers in a triangle format
 * public class Day2 {
 * public static void main(String[] args) {
 * int n = 1;
 * for (int i = 1; i <= 5; i++) {
 * for (int j = 1; j <= i; j++) {
 * System.out.print(n + " ");
 * n++;
 * }
 * System.out.println();
 * }
 * }
 * }
 * 
 * 
 * // 0 1 0 1 triangle pattern
 * class Day2 {
 * public static void main(String[] args) {
 * int n = 4;
 * for (int i = 1; i <= n; i++) {
 * for (int j = 1; j <= i; j++) {
 * if ((i + j) % 2 == 0) { // uses sum of position of row and column, if sum is
 * even then print 1 else 0
 * System.out.print("1 ");
 * } else {
 * System.out.print("0 ");
 * }
 * }
 * System.out.println();
 * }
 * }
 * }
 * 
 * 
 * 
 * public class Day2 {
 * public static void main(String[] args) {
 * for (int i = 5; i >= 1; i--) {
 * for (int j = 1; j <= i; j++) {
 * System.out.print(j + " ");
 * }
 * System.out.println();
 * }
 * }
 * }
 * 
 * 
 * //create a function printName which take name as a parameter and print hello
 * name
 * 
 * public class Day2 {
 * public static int add(int a, int b) {
 * return a + b;
 * }
 * 
 * public static void main(String[] args) {
 * int result = add(5, 6);
 * System.out.println(result);
 * 
 * }
 * }
 * 
 */
