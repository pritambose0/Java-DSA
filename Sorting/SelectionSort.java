public class SelectionSort {
    public static void main(String[] args) {
        int[] arr = {4,1,5,2,6};
        selectionSort(arr);
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }

    static void selectionSort(int[] arr){
        int n = arr.length;
        for(int i=0;i<n-1;i++){
            int minIndex = i;

            for(int j=i+1;j<n;j++){
                if(arr[j]<arr[minIndex]){
                    int temp = arr[j];
                    arr[j] = arr[minIndex];
                    arr[minIndex] = temp;
                }
            }
        }
    }
}
