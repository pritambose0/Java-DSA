//Merge Two Sorted Arrays

public class Ques2 {
    static int[] sort(int[] arr1, int[] arr2, int m, int n){
        int[] brr = new int[10];
        int i=0,j=0,k=0;

        while(i<m && j<n){
            if(arr1[i]<arr2[j]){
                brr[k++]=arr1[i++];
            }
            else{
                brr[k++]=arr2[j++];
            }
        }

        while(i<m){
            brr[k++]=arr1[i++];
        }
        while(j<n){
            brr[k++]=arr2[j++];
        }

        return brr;
    }
    public static void main(String[] args) {
        int[] arr1 ={1,2,3,9};
        int m=arr1.length;
        int[] arr2 ={2,5,6};
        int n = arr2.length;
        int[] res = sort(arr1,arr2,m,n);

        for(int i=0;i<res.length;i++){
            System.out.print(res[i]+" ");
        }
    }
}
