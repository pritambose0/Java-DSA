// 1+2-3+4-5

public class seriesaddition {
    public static void main(String[] args) {
        int n=5;
        int ans=series(n);
        System.out.println(ans);
    }

    public static int series(int n) {
        if(n==0) return n;

        if(n%2==0){
            return series(n-1)-n;
        }else{
            return series(n-1)+n;
        }
    }
}
