public class multiply {
    public static void main(String[] args) {
        int[][] arr = {{1,2,3},{4,5,6},{7,8,9}};
        int r1 = arr.length;
        int c1 = arr[0].length;
        int[][] brr = {{9,8,7},{6,5,4},{3,2,1}};
        int r2 = brr.length;
        int c2 = brr[0].length;
        matrixMul(arr,r1,c1,brr,r2,c2); 
    }

    public static void matrixMul(int[][] arr,int r1, int c1, int[][] brr,int r2, int c2) {
        int[][] res = new int[r1][c2];
        
        if(c1!=r2){
            System.out.println("Multiply not possible");
            return;
        }

        for(int i=0;i<r1;i++){
            for(int j=0;j<c2;j++){
                for(int k=0;k<c1;k++){
                    res[i][j] += arr[i][k] * brr[k][j];
                }
            }
        }
        printArray(res,r1,c2);
        
    }

    public static void printArray(int[][] res,int r1, int c2) {
        for(int i=0;i<r1;i++){
            for(int j=0;j<c2;j++){
                System.out.print(res[i][j]+" ");
            }
        }
    }
}
