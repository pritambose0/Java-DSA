//Merge Two Sorted Arrays

public class Que2test {
    static void sort(int[] arr1, int[] arr2, int m, int n){
        // int[] brr = new int[10];
        int i=0,j=0,k=0;

        while(i<m && j<n){
            if(arr1[i]<=arr2[j]){
                arr1[k++]=arr1[i++];
            }
            else{
                arr1[k++]=arr2[j++];
            }
        }

        while(i<m){
            arr1[k++]=arr1[i++];
        }
        while(j<n){
            arr1[k++]=arr2[j++];
        }

    }
    public static void main(String[] args) {
        int[] nums1 =new int[]{1,2,3,9,0,0,0};
        int[] nums2 =new int[]{2,5,6};
        int m=nums1.length;
        int n=nums2.length;
        sort(nums1,nums2,m,n);

        for(int i=0;i<m+n;i++){
            System.out.print(nums1[i]+" ");
        }
    }
}
