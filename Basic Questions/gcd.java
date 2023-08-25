public class gcd {
    public static void main(String[] args) {
        int x=24;
        int y=16;
        while(x%y!=0){
            int rem = x%y;
            x=y;
            y=rem;
        }
        System.out.println(y);
    }
}
