public class ClimbingStairs {
    public static void main(String[] args) {
        int n = 4;
        int ans = cs(n);
        System.out.println(ans);
    }

    private static int cs(int n) {
        if(n<0) return 0; 
        if(n==0) return 1;

        return cs(n-1) + cs(n-2);
    }    
}
