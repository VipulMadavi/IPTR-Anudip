public class RunTimePoly {
    public static void main(String[] args) {
        Animal animal = new Animal();
        animal.sound();
        Animal dog = new Dog();
        dog.sound();
        Animal cat = new Cat();
        cat.sound();
    }

}

class Animal {
    void sound() {
        System.out.println("Animal sound");
    }
}

class Dog extends Animal {
    @Override
    void sound() {
        System.out.println("Dog Barks");
    }
}

class Cat extends Animal {
    @Override
    void sound() {
        System.out.println("Cat Meows");
    }
}