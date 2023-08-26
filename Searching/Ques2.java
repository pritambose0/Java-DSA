// Square Root of a Number (Floor Value) using Binary Search

public class Ques2 {
    public static void main(String[] args) {
        int x = 24;
        System.out.println(squareRoot(x));
    }

    private static int squareRoot(int key) {
        int start = 0;
        int end = key;
        int ans = -1;
        while(start<=end){
            int mid = start+(end-start)/2;
            int val = mid * mid;
            if(val == key){
                return mid;
            }
            else if(val < key){
                ans = mid;
                start = mid+1;
            }
            else{
                end = mid-1;
            }
        }
        return ans;
    }
}
