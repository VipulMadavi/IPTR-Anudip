public class singleInherit {
    public static void main(String[] args) {
        Triangle T1 = new Triangle();
        T1.area();
        T1.calArea(2, 3);
    }
}

class Shape {
    void area() {
        System.out.println("Displaying Area!!!!");
    }
}

class Triangle extends Shape {
    void calArea(int b, int h) {
        System.out.println((0.5 * b * h));
    }
}