public class AverageOfThree_02 {

    public static double calculateAverage(double a, double b, double c) {
        return (a + b + c) / 3;
    }

    public static void main(String[] args) {
        double first = 25;
        double second = 45;
        double third = 65;

        double average = calculateAverage(first, second, third);

        System.out.println("The average value is " + average + ".");
    }
}
