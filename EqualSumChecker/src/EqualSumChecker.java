public class EqualSumChecker {
    public static boolean hasEqualSum(int firstInt, int secondInt, int thirdInt){
        if ((firstInt + secondInt) == thirdInt){
            return true;
        }
        return false;
    }
}
