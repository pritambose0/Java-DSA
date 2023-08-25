public class MaxNum {
    public static void main(String[] args) {
        int[] arr = {5,2,7,3,1};
        System.out.println(maxArr(arr, 0));
    }

    public static int maxArr(int[] arr, int idx) {
        if(idx==arr.length-1) return arr[idx];
        return Math.max(arr[idx],maxArr(arr, idx+1));    
    }
}
  