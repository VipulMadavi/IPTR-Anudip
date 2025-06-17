public class staticVariable {
    public static void main(String[] args) {
        Student s1 = new Student(111, "Rahul");
        Student s2 = new Student(222, "Manoj");
        s1.display();
        s2.display();
    }

}

class Student {
    int rollno;
    String name;
    static String college = "DYPTC";

    Student(int rollno, String name) {
        this.rollno = rollno;
        this.name = name;
    }

    void display() {
        System.out.println(rollno + " " + name + " " + college);
    }
}
