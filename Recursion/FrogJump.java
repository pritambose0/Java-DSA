public class FrogJump {
    public static void main(String[] args) {
        int[] arr = {10,30,40,20};
        int n = arr.length;

        System.out.println(frogJump(arr,n,0));
    }

    public static int frogJump(int[] arr, int n, int idx) {
        if(idx==n-1) return 0;
        if(idx==n-2) return frogJump(arr, n, idx+1) + Math.abs(arr[idx] - arr[idx+1]);

        return Math.min(frogJump(arr, n, idx+1) + Math.abs(arr[idx] - arr[idx+1]),frogJump(arr, n, idx+2) + Math.abs(arr[idx] - arr[idx+1]));
    }
}
