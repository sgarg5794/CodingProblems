package amz;

public class MergeSortv1 {

    public int[] merge(int[] nums1, int m, int[] nums2, int n) {
        int[] returnArray=new int[nums1.length];
        int x=0;
        int i=0 ;
        int j=0;
        while(i<m && j<n ){
            if(nums1[i]<nums2[j]){
                returnArray[x++]=nums1[i];
                i++;
            }else{
                returnArray[x++]=nums2[j];
                j++;
            }
        }
        while(i<m){
            returnArray[x++]=nums1[i];
            i++;
        }
        while(j<n){
            returnArray[x++]=nums2[j];
            j++;
        }
        for(int c:returnArray){
            System.out.println(c);
        }
        return returnArray;
    }
}
