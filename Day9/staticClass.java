public class staticClass {
    public static void main(String[] args) {
        Outer.Inner obj = new Outer.Inner();
        obj.display();
    }
}

class Outer {
    static int x = 10;

    static class Inner {
        void display() {
            System.out.println(x);
        }
    }
}
