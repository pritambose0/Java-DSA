import java.util.Scanner;
public class RemoveChar{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a String: ");
        String s = sc.nextLine();
        System.out.println(removeA2(s));
        sc.close();
    }

    public static String removeA2(String s) {
        //Base Case
        if(s.length()==0) return ""; 

        //Big Problem
        String ans = removeA2(s.substring(1));

        //Self Work
        if(s.charAt(0)!='a'){
            return s.charAt(0) + ans;
        }else{
            return ans;
        }
    }

    public static String removeA(String s, int idx) {
        //Base Case
        if(idx==s.length()) return "";

        //Big Problem
        String ans = removeA(s, idx+1);

        //Self Work
        if(s.charAt(idx)!='a'){
            return ans + s.charAt(idx);
        }else{
            return ans;
        }
    }
}