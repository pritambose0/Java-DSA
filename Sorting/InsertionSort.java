public class InsertionSort {
    public static void main(String[] args) {
        int[] arr = {5,2,7,3,9};
        insertionSort(arr);
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }

    private static void insertionSort(int[] arr) {
        int n = arr.length;
        for(int i=1;i<n;i++){
            int temp = arr[i];
            int j = i-1;
            while(j>=0){
                if(arr[j]>temp){
                    arr[j+1] = arr[j];
                }
                else{
                    break;
                }
                j--;
            }
            arr[j+1] = temp;
        }
    }
}
