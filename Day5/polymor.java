
public class polymor {
    public static void main(String[] args) {
        Parent p1 = new Parent();
        p1.show();
        Child C1 = new Child();
        C1.show();
        C1.display();
    }
}

class Parent {
    void show() {
        System.out.println("Parent Class");
    }
}

class Child extends Parent {
    void display() {
        System.out.println("Child Class");
    }
}
