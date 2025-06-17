public class interf {
    public static void main(String[] args) {
        Horse h = new Horse();
        h.walk();
        Chicken c = new Chicken();
        c.walk();

    }
}

interface Animal {
    public void walk();

}

class Horse implements Animal {
    @Override
    public void walk() {
        System.out.println("Horse is Running");
    }
}

class Chicken implements Animal {
    @Override
    public void walk() {
        System.out.println("Chicken is walking");
    }
}