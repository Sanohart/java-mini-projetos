public class Main {
    public static void main(String[] args) {
        boolean teste1 = DecimalComparator.areEqualByThreeDecimalPlaces(-3.1756, -3.175);
        boolean teste2 = DecimalComparator.areEqualByThreeDecimalPlaces(3.175, 3.176);
        boolean teste3 = DecimalComparator.areEqualByThreeDecimalPlaces(3.0, 3.0);
        boolean teste4 = DecimalComparator.areEqualByThreeDecimalPlaces(-3.123, 3.123);

        System.out.println(teste1 + " " + teste2 + " " + teste3 + " " + teste4);
    }
}
