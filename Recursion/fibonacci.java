import java.util.Scanner;

public class fibonacci {
    static int fibo(int n){
        if(n==0 || n==1) return n;

        return fibo(n-1) + fibo(n-2);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter ath Number");
        int n = sc.nextInt();
        int res=fibo(n);
        System.out.println(res);
        sc.close();
    }
}
