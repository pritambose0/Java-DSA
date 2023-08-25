public class ConsecutiveDuplicate {
    public static void main(String[] args) {
        String s = "aabbcs";
        System.out.println(removeDuplicate(s));
    }

    public static String removeDuplicate(String s) {
        //Base Case
        if(s.length()<1) return "";

        //Recursive Problem
        if(s.length()>=2 && s.charAt(0)==s.charAt(1)){
            return removeDuplicate(s.substring(1));
        }

        //Self Work
        return s.charAt(0) + removeDuplicate(s.substring(1));
    }
}
