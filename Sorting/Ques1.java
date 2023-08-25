public class Ques1 {
    public static void main(String[] args) {
        int[] arr = {10,5,6,7,8,9,3};
        sortNum(arr);

        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }

    private static void sortNum(int[] arr) {
        int x = -1;
        int y = -1;

        for(int i=1;i<arr.length;i++){
            if(arr[i-1]>arr[i]){
                if(x==-1){
                    x = i-1;
                    y = i;
                }
                else{
                    y = i;
                }
            }
        }

        int temp = arr[x];
        arr[x] = arr[y];
        arr[y] = temp;
    }
}
