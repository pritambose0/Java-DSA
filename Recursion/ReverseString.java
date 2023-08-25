import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.println(reverseS(str));
        sc.close(); 
    }

    public static String reverseS(String s){
        //Base Case
        if(s.length()==0) return "";

        // Recursive Work
        String ans = reverseS(s.substring(1));

        //Self Work
        return ans+s.charAt(0);
    }
}
