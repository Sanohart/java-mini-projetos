public class DecimalComparator {
    public static boolean areEqualByThreeDecimalPlaces(double firstDouble, double secondDouble){
        int firstInt = (int) (firstDouble * 1000);
        int secondInt = (int) (secondDouble * 1000);
        if (firstInt == secondInt){
            return true;
        } else {
            return false;
        }
    }
}
