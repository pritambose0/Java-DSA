//Sort 0s and 1s in an Array
public class Ques1 {
    static void printArray(int[] arr) {
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");

        }
    }
    static void sortZeroes(int[] arr){
        int count = 0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==0){
                count++;
            }
        }

        for(int i=0;i<arr.length;i++){
            if(i<count){
                arr[i]=0;
            }else{
                arr[i]=1;
            }

        }
    }
    public static void main(String[] args) {
        int[] arr = {1,0,1,0,0,1};
        sortZeroes(arr);
        printArray(arr);

    }

}
