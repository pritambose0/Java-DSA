public class ReverseString {
    public static void main(String[] args) {
        String str = "Pritam";
        System.out.println(reverse(str));
    }

    private static String reverse(String str) {
        String ans = "";
        for(int i=str.length()-1;i>=0;i--){
            ans += str.charAt(i);
        }
        return ans;
    }
}
