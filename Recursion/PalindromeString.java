public class PalindromeString {
    public static void main(String[] args) {
        String str = "LEVEL";
        System.out.println(isPalindrome(str,0,str.length()-1));
    }

    public static boolean isPalindrome(String str, int l, int r) {
        if(l>=r) return true;

        return (str.charAt(l)==str.charAt(r) && isPalindrome(str, l+1, r-1));
    }
}
