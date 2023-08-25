public class primeNum {
    static void primeOrNot(int n){
        boolean flag = true;
        for(int i=2;i<=n/2;i++){
            if(n % i==0){
                flag = false;
            }
        }

        if(flag){
            System.out.println("Prime Number");
        }
        else{
            System.out.println("Not Prime Number");
        }
    }
    public static void main(String[] args) {
        int n=29;
        primeOrNot(n);
    }
}
