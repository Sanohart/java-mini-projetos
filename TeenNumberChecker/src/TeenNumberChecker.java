public class TeenNumberChecker {
    public static boolean hasTeen(int firstInt, int secondInt, int thirdInt){
        if (isTeen(firstInt) || isTeen(secondInt) || isTeen(thirdInt)){
            return true;
        }
        return false;
    }

    public static boolean isTeen(int anotherInt){
        if (anotherInt >= 13 && anotherInt <= 19){
            return true;
        }
        return false;
    }
}
