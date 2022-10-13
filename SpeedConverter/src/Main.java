public class Main {
    public static void main(String[] args) {

        double kilometersPerHour = 1.5;

        double miles = SpeedConverter.toMilesPerHour(kilometersPerHour);
        System.out.println("Miles = " + miles);

        SpeedConverter.printConversion(kilometersPerHour);
    }
}
