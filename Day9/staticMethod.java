public class staticMethod {
    public static void main(String[] args) {
        System.out.println(MathUtils.square(5));
        System.out.println(MathUtils.cube(5));
        System.out.println(MathUtils.sum(5, 5));
    }

}

class MathUtils {
    static int square(int n) {
        return n * n;
    }

    static int cube(int n) {
        return n * n * n;
    }

    static int sum(int a, int b) {
        return a + b;
    }
}