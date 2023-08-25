public class gcd {
    public static void main(String[] args) {
        int x=25;
        int y=15; 
        int ans = igcd(x,y);
        System.out.println(ans);
    }

    public static int igcd(int x, int y) {
        if(y==0){
            return x;
        }
        return igcd(y,x%y);
    }
}
