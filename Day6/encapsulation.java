public class encapsulation {
    private int age;
    private String name;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static void main(String[] args) {
        encapsulation obj = new encapsulation();
        obj.setAge(20);
        obj.setName("Raj");
        System.out.println("Age: " + obj.getAge());
        System.out.println("Name: " + obj.getName());
    }
}
