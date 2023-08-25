//Square of every element of an Array

public class Ques3 {
    static int[] square(int[] arr){
        int n=arr.length;
        int[] ans = new int[n];
        int s=0,e=n-1,k=n-1;
        while(s<=e){
            if(Math.abs(arr[s])>Math.abs(arr[e])){
                ans[k--]=arr[s]*arr[s];
                s++;
            }
            else{
                ans[k--]=arr[e]*arr[e];
                e--;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] arr ={-4,-1,0,3,10};
        int[] ans = square(arr);
        for(int i=0;i<ans.length;i++){
            System.out.print(ans[i]+" ");
        }
    }
}
