public class KeypadCombinations {
    public static void main(String[] args) {
        String digit = "23";
        String[] kp = {"","","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
        combinations(digit,kp,"");
    }

    private static void combinations(String digit,String[] kp, String res) {
        if(digit.length() == 0){
            System.out.print(res+" ");
            return;
        }

        int currNum = digit.charAt(0) - '0';
        String currChoices = kp[currNum];

        for(int i=0;i<currChoices.length();i++){
            combinations(digit.substring(1), kp, res + currChoices.charAt(i));
        }
    }
}
