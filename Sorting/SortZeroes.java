public class SortZeroes {
    public static void main(String[] args) {
        int[] arr = {5,0,2,0,1};
        sortZero(arr);
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }

    private static void sortZero(int[] arr) {
        int n = arr.length;
        
        for(int i=1;i<n;i++){
            for(int j=0;j<n-1;j++){
                if(arr[j]==0 && arr[j+1] != 0){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }
}
