public class BinarySrch {
    public static void main(String[] args) {
        int[] arr = {2,4,6,8,10};
        System.out.println(binarySrch(arr,8,0,arr.length-1));
    }

    private static int binarySrch(int[] arr, int target,int s, int e) {
        int mid = (s+e)/2;

        // Base Case
        if(s>e) return -1;

        //Recursive Work
        if(arr[mid] == target){
            return mid;
        }
        else if(target > arr[mid]){
            return binarySrch(arr, target,mid+1,e);
        }
        else{
            return binarySrch(arr, target,s,mid-1);
        }
    }
}

