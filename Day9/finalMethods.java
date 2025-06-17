public class finalMethods {
    public static void main(String[] args) {
        Bike obj = new Bike();
        obj.run();
    }

}

class Vehicle {
    final void run() {
        System.out.println("running");
    }
}

class Bike extends Vehicle {
    @Override
    void run() {
        System.out.println("running safely with 100kmph");
    }
}