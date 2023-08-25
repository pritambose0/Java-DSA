public class QuickSort {
    public static void main(String[] args) {
        int[] arr = {5,3,7,1,8};
        quickSort(arr,0,arr.length-1);

        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }

    private static void quickSort(int[] arr, int s, int e) {

        if(s>=e) return;

        int pi = partition(arr,s,e);

        quickSort(arr, s, pi-1);

        quickSort(arr, pi+1, e);

    }

    private static int partition(int[] arr, int s, int e) {
        
        int pivot = arr[s];

        int count = 0;
        for(int i=s+1;i<=e;i++){
            if(arr[i]<pivot){
                count++;
            }
        }

        int pivotIdx = s + count;
        int temp = arr[s];
        arr[s] = arr[pivotIdx];
        arr[pivotIdx] = temp;

        int i = s;
        int j = e;
        while(i<pivotIdx && j>pivotIdx){
            while(arr[i]<= pivot){
                i++;
            }

            while(arr[j]>= pivot){
                j--;
            }

            if(i<pivotIdx && j>pivotIdx){
                int tempo = arr[i];
                arr[i] = arr[j];
                arr[j] = tempo;
                i++;
                j--;
            }
        }
        return pivotIdx; 

    }
}
