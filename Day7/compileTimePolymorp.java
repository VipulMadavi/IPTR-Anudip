import java.util.Scanner;

public class compileTimePolymorp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Name: ");
        String name = sc.nextLine();
        System.out.println("Enter Age: ");
        int age = sc.nextInt();

        Student s1 = new Student();
        s1.printInfo(name);
        s1.printInfo(age);
        // s1.printInfo("Vipul", 21);
    }

}

class Student {
    String name;
    int age;

    void printInfo(String name) {
        System.out.println(name);
    }

    void printInfo(int age) {
        System.out.println(age);
    }

    void printInfo(String name, int age) {
        System.out.println(name + " " + age);
    }
}
