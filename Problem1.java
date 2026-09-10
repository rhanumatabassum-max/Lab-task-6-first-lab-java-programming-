public class Smallest_number_01 {

    public static double findSmallest(double a, double b, double c) {
        return Math.min(a, Math.min(b, c));
    }

    public static void main(String[] args) {
        double first = 25;
        double second = 37;
        double third = 29;

        double smallest = findSmallest(first, second, third);

        System.out.println("The smallest value is " + smallest + ".");
    }
}
