public class ArrayRecursion {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        arrRec(arr,0);
    }

    public static void arrRec(int[] arr, int idx) {
        //Base Case
        if(idx==arr.length) return;

        //Self Work
        System.out.println(arr[idx]);

        //Bigger Problem
        arrRec(arr, idx+1);
    }
}
