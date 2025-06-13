public class oops {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.printInfo();
        Student s2 = new Student("Manoj", 21);
        System.out.println(s2.name);
        s2.printInfo();

        Student s3 = new Student(s2);
        s3.name = "Rahul";
        s3.printInfo();
    }
}

class Student {
    String name;
    int age;

    // Default Constructor
    Student() {
        System.out.println("A Default Constructor is called!!!!!");
    }

    // Parameterized Constructor
    Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    Student(Student original) {
        this.name = original.name;
        this.age = original.age;
    }

    public void printInfo() {
        System.out.println(this.name); // this keyword is used to point out to that object and distinguish between
                                       // instance parameters and class parameters
        System.out.println(this.age);
    }

}