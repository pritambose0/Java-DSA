public class ConsequencesString {
    public static void main(String[] args) {
        String s = "abc";
        PrintSSQ(s,"");
    }

    public static void PrintSSQ(String s, String ans) {
        if(s.length()==0){
            System.out.println(ans);
            return;
        }

        String remAns = s.substring(1);

        //Recursive Work

        PrintSSQ(remAns,ans);
        PrintSSQ(remAns,ans+s.charAt(0));
    }
}
