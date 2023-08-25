import java.util.Scanner;

public class matrixMul {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter row1");
        int r1 = sc.nextInt();
        System.out.println("Enter column1");
        int c1 = sc.nextInt();

        int[][] arr=new int[r1][c1];
        arr=inputArr(arr,r1,c1);

        System.out.println("Enter row2");
        int r2 = sc.nextInt();
        System.out.println("Enter column2");
        int c2 = sc.nextInt();

        int[][] brr=new int[r2][c2];
        brr=inputArr(brr,r2,c2);

        int[][] res = matrixMultiply(arr,r1,c1,brr,r2,c2);
        printArray(res,r1,c2);
        sc.close();
    }

    public static void printArray(int[][] res, int r1, int c2) {
        for(int i=0;i<r1;i++){
            for(int j=0;j<c2;j++){
                System.out.println(res[i][j]);
            }
        }
    }

    public static int[][] matrixMultiply(int[][] arr, int r1, int c1, int[][] brr, int r2, int c2) {
        if(c1 != r2){
            System.out.println("Multiply Not Possible");
            return null;
        }
        int[][] res = new int[r1][c2];
        for(int i=0;i<r1;i++){
            for(int j=0;j<c2;j++){
                for(int k=0;k<r2;k++){
                    res[i][j] += arr[i][k] * arr[k][j];
                }
            }
        }
        return res;
    }

    public static int[][] inputArr(int[][] arr,int r1, int c1) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter r1*c1 Elements");
        for(int i=0;i<r1;i++){
            for(int j=0;j<c1;j++){
                arr[i][j] = sc.nextInt();
            }
        }
        sc.close();;
        return arr;
    }
}
