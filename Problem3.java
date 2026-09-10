public class cat_03 {
    String name;
    int age;

    // Default constructor
    public cat_03() {
        name = "Unknown";
        age = 0;
    }

    public static void main(String[] args) {
        cat_03 cat = new cat_03();

        System.out.println("Cat name: " + cat.name);
        System.out.println("Cat age: " + cat.age);
    }
}
