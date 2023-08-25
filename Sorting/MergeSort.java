public class MergeSort {
    public static void main(String[] args) {
        int[] arr = {7,3,1,9,5};
        int n = arr.length;
        mergeSort(arr,0,n-1);
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
    }

    private static void mergeSort(int[] arr, int s, int e) {
        int mid = (s+e)/2;
        
        if(s>=e){
            return;
        }
        mergeSort(arr, s, mid);
        mergeSort(arr, mid+1, e);
        merge(arr,s,mid,e);
    }

    private static void merge(int[] arr, int s,int mid, int e) {
        int i = s;
        int j = mid+1;
        int k = s;
        int n = arr.length;
        int[] res = new int[n];
        while(i<=mid && j<=e){
            if(arr[i]<=arr[j]){
                res[k++] = arr[i++];
            }else{
                res[k++] = arr[j++];
            }
        }

        while(i<=mid){
            res[k] = arr[i];
            i++;
            k++;
        }

        while(j<=e){
            res[k] = arr[j];
            j++;   
            k++;
        }

        for(i=s;i<=e;i++){
            arr[i] = res[i];
        }
    }
}
 