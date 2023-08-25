public class addition {
    static int[][] additionmatx(int[][] a,int[][] b,int r, int c){
        int[][] sum = new int[r][c];
        for(int i=0;i<a.length;i++){
            for(int j=0;j<b.length;j++){
                sum[i][j]=a[i][j]+b[i][j];
            }
        }
        return sum;
    }
    public static void main(String[] args) {
        int[][] a ={{2,3},{4,5}};
        int[][] b ={{1,2},{3,4}};

        int[][] ans = additionmatx(a,b,2,2);
        for(int i=0;i<a.length;i++){
            for(int j=0;j<a.length;j++){
                System.out.println(ans[i][j]);
            }
        }
    }
}
