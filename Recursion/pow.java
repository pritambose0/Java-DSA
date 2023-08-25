public class pow {
    // static int power(int p, int q){
    //     if(q==0) return 1;
    //     return power(p,q-1) * p;

    // }

    // Alternative Approach
    static int power(int p, int q){
        if(q==0) return 1;
        int smallAns = power(p,q/2);
        if(q%2==0){
            return smallAns * smallAns;
        }else{
            return p * smallAns * smallAns;
        }
        
    }

    public static void main(String[] args) {
        int p = 2;
        int q = 4;
        int ans = power(p,q);
        System.out.println(ans);
    }
}
