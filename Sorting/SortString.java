public class SortString {
    public static void main(String[] args) {
        String[] st = {"kiwi","apple","papaya","mango"};
        sortFruits(st);
        for(String val: st){
            System.out.print(val+" ");
        }
    }

    private static void sortFruits(String[] st) {
        int n = st.length;

        for(int i=0;i<n-1;i++){
            int minIdx = i;
            for(int j=i+1;j<n;j++){
                if(st[j].compareTo(st[minIdx])<0){
                    minIdx = j;
                }
            }
            String temp = st[i];
            st[i] = st[minIdx];
            st[minIdx] = temp;
        }
    }
}
