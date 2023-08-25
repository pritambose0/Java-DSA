public class sumOfDigits {
    static int sumOfD(int n){
        if(n>=0 && n<=9) return n;
        return sumOfD(n/10) + n%10;
    }
    public static void main(String[] args) {
        int n = 1234;
        int res = sumOfD(n);
        System.out.println(res);
    }
}
