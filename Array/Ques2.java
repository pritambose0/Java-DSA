//Even Odd Sort Using Two Pointers

public class Ques2 {
    public static void main(String[] args) {
        int[] arr ={1,2,3,4,5,6};
        int n=arr.length;
        sort(arr,0,n-1);

        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
    }
    static void sort(int[] arr, int s,int e){
        while(s<e){
            if(arr[s]%2==1 && arr[e]%2==0){
                int temp = arr[s];
                arr[s]=arr[e];
                arr[e]=temp;
                s++;
                e--;
            }
            
            if(arr[s]%2==0 && arr[e]%2==1){
                s++;
                e--;
            }
        }
    }
}
