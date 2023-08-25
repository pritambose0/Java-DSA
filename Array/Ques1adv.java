public class Ques1adv {
    static void sort(int[] arr, int s,int e){
        for(int i=s,j=e;i<j;i++,j--){
            if(arr[i]>arr[j]){
                int temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
            }
        }
    }
    public static void main(String[] args) {
        int[] arr = {1,0,0,1,1,0};
        int n = arr.length;
        sort(arr,0,n-1);
        
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
