public class Main {
    public static void main(String[] args) {
        boolean r1 = LeapYear.isLeapYear(-1600);
        boolean r2 = LeapYear.isLeapYear(1600);
        boolean r3 = LeapYear.isLeapYear(2017);
        boolean r4 = LeapYear.isLeapYear(2000);

        System.out.println("Is a leap year: " + r1);
        System.out.println("Is a leap year: " + r2);
        System.out.println("Is a leap year: " + r3);
        System.out.println("Is a leap year: " + r4);
    }
}
