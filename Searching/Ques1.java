// Left Most Index of an Array using Binary Search Algorithm

public class Ques1{
    public static void main(String[] args) {
        int[] arr = {1,2,3,3,4,6,3};
        System.out.println(leftIdx(arr,0,arr.length-1,3));
    }

    private static int leftIdx(int[] arr,int start, int end,int key) {
        int fo = -1; //First Index
        while(start <= end){
            int mid = start+(end-start)/2;
            if(arr[mid] == key){
                fo = mid;
                end = mid-1;
            }else if(key < arr[mid]){
                end = mid-1;
            }else{
                start = mid+1;
            }
        }
        return fo;
    }
}