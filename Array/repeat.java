public class repeat {
    public static void main(String[] args) {
        int[] arr = {1,2,4,2,4,5};
        int ans = repeatingVal(arr);
        System.out.println(ans);
    }

    public static int repeatingVal(int[] arr) {
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]==arr[j]){
                    return arr[i];
                }
            }
        }
        return -1;
    }    
}
