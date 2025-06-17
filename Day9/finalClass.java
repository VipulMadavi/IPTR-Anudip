public class finalClass {
    public static void main(String args[]) {
        Bike obj = new Bike();
        obj.run();
    }

}

final class Vehicle {
    void run() {
        System.out.println("running");
    }
}

class Bike extends Vehicle {
    void run() {
        System.out.println("running safely with 100kmph");
    }
}
