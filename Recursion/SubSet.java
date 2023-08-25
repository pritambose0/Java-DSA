public class SubSet {
    public static void main(String[] args) {
        int[] a = {1,2,3};
        int n= a.length;
        PrintSubSet(a,n,0,0);
        
    }

    public static void PrintSubSet(int[] a, int n, int idx, int sum) {
        if(idx>=n) {
            System.out.println(sum);
            return;
        }

        PrintSubSet(a, n, idx+1, a[idx]+sum);
        PrintSubSet(a, n, idx+1, sum); 
    }
}
