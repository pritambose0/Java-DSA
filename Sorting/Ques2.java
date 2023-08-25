class Ques2{
    public static void main(String[] args) {
        int[] arr = {7,-1,2,-6,8,-3};
        sort(arr,0,arr.length-1);

        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i] + " ");
        }
    }

    private static void sort(int[] arr,int s,int e) {
        int i = s;
        int j = e;

        while(i<j){
            while(arr[i]<0){
                i++;
            }
            while(arr[j]>=0){
                j--;
            }

            if(i<j){
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                i++;
                j--;
            }
        }

    }
}