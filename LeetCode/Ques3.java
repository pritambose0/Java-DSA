// Rotate Array by K steps

public class Ques3 {
    static void rotate(int[] arr, int k){
        int[] temp = new int[arr.length];
        for(int i=0;i<arr.length;i++){
            temp[(i+k)%arr.length] = arr[i];
        }
        // Copying temp to arr
        System.arraycopy(temp, 0, arr, 0, arr.length);
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        int k=2;
        rotate(arr,k);

        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
