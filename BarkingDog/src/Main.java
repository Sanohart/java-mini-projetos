public class Main {
    public static void main(String[] args) {
        boolean result1 = BarkingDog.shouldWakeUp(true,1);
        boolean result2 =BarkingDog.shouldWakeUp(false, 2);
        boolean result3 =BarkingDog.shouldWakeUp(true, 8);
        boolean result4 =BarkingDog.shouldWakeUp(true, -1);

        System.out.println(result1);
        System.out.println(result2);
        System.out.println(result3);
        System.out.println(result4);
    }
}
