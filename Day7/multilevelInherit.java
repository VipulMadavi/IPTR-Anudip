
public class multilevelInherit {
    public static void main(String[] args) {
        Shape s1 = new Shape();
        Triangle t1 = new Triangle();
        t1.area();
        s1.area();

        EquilateralTriangle e1 = new EquilateralTriangle();
        e1.area();
        e1.calArea(2, 3);
        e1.calArea(2);
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

class EquilateralTriangle extends Triangle {
    void calArea(int s) {
        System.out.println((1.73 * s * s) / 4);
    }

}
