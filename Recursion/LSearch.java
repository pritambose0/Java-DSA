public class LSearch {
    public static void main(String[] args) {
        int[] arr = {1,2,3,2};
        int target = 2;
        linSearch(arr, target, 0);
    }

    public static void linSearch(int[] arr, int target, int idx) {
        if(idx >= arr.length){
            return; 
        }

        if(arr[idx] == target){
            System.out.println(idx);
        }

        linSearch(arr,target,idx+1);
    }
}
