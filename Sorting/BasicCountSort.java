public class BasicCountSort {
    public static void main(String[] args) {
        int[] arr = {5,2,7,1,8};
        countSort(arr);

        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }

    private static void countSort(int[] arr) {
        int max = findMax(arr);
        int[] count = new int[max+1];

        for(int i=0;i<arr.length;i++){
            count[arr[i]]++;
        }

        int k = 0;
        for(int i=0;i<count.length;i++){
            for(int j=0;j<count[i];j++){
                arr[k++] = i;
            }
        }

    }

    private static int findMax(int[] arr) {
        int mx = Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>mx){
                mx = arr[i];
            }
        }
        return mx;
    }
}
