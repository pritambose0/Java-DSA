public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = {5,2,8,1,6};
        sort(arr);

        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }

    private static void sort(int[] arr) {
        boolean flag = false;
        for(int i=1;i<arr.length-1;i++){
            for(int j=0;j<arr.length-i;j++){
                if(arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    flag = true;
                }
            }
            if(!flag){
                return;
            }
        }
    }
}
