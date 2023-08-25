import java.util.Scanner;

public class rotatearray {
    public static void rotateArr(int[] arr,int s,int e){
        for(int i=s,j=e;i<=j;i++,j--){
            int temp=arr[i];
            arr[i]= arr[j];
            arr[j]=temp;
        }
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        sc.close();
        int n = arr.length-1;
        k=k%n;
        rotateArr(arr,0,n);
        rotateArr(arr,0,k-1);
        rotateArr(arr,k,n);
        //Printing the Array
        for(int i=0;i<=n;i++){
            System.out.print(arr[i]+ " ");
        }
    }
}
