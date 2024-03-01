package array;

public class ArrayProblems {
    public static void main(String[] args) {
        int[] numeri = new int[20];
        
        ArrayTools.linearSequence(numeri, 1,0);
        ArrayTools.print(numeri);
        ArrayTools.linearSequence(numeri, 1,1);
        ArrayTools.print(numeri);
        ArrayTools.linearSequence(numeri, 2,1);
        ArrayTools.print(numeri);
        ArrayTools.linearSequence(numeri, -1,numeri.length);
        ArrayTools.print(numeri);

        int[] nums = null;
        
        ArrayTools.print(nums);
    }
}
