public class reverse{
    static int reverseD(int n){
        int reverse = 0;
        while(n!=0){
            int lastDigit = n%10;
            reverse = reverse * 10 + lastDigit;
            n = n/10;
        }
        return reverse;
    }
    public static void main(String[] args) {
        int n = 1234;
        int res=reverseD(n);
        System.out.println(res); 
    }
}
