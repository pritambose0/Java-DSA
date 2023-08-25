public class ReverseString {
    public static void main(String[] args) {
        String str = "naba";
        isPalindrome(str);
    }

    private static void isPalindrome(String str) {
        int i = 0;
        int j = str.length()-1;
        boolean flag = true;
        while(i<=j){
            if(str.charAt(i++) != str.charAt(j--)){
                flag = false;
            }
        }

        if(!flag){
            System.out.println("Not Palindrome");
        }
        else{
            System.out.println("Palindrome");
        }
    }
}
