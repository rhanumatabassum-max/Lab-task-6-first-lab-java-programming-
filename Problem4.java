class Dog {
    String name;
    String color;

    // Parameterized Constructor
    public Dog(String name, String color) {
        this.name = name;
        this.color = color;
    }

    public void displayInfo() {
        System.out.println("Name: " + name + ", Color: " + color);
    }
}

public class MainDog {
    public static void main(String[] args) {
        Dog myDog = new Dog("Buddy", "Brown");
        myDog.displayInfo();
    }
}
