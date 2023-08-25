public class Ques1 {
    static void sort(int[] arr, int n){
        int j=0;
        for(int i=0;i<n;i++){
            if(arr[i]!=0){
                arr[j++]=arr[i];
            }
        }
        while(j<n){
            arr[j++]=0;
        }
    }
    public static void main(String[] args) {
        int[] arr ={1,0,3,5,0,0};
        int n = arr.length;
        sort(arr,n);

        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
