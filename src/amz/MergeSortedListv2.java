package amz;

public class MergeSortedListv2 {

    public void merge(int[] nums1, int m, int[] nums2, int n) {
//
//        List<Integer> nums1List= Arrays.stream(nums1).boxed().collect(Collectors.toList());
//        Collections.reverse(nums1List);
//        List<Integer> sublist = nums1List.subList(n, nums1List.size());
//        Collections.reverse(sublist);
        //System.out.println(sublist);
        for(int i=0;i<nums1.length/2;i++){
            int temp=nums1[i];
            nums1[i]=nums1[nums1.length-1-i];
            nums1[nums1.length-1-i]=temp;
        }
        int k=0;
        for(int i=n;i<n+((nums1.length-n+1)/2);i++){
            int temp=nums1[i];
            nums1[i]=nums1[nums1.length-1-k];
            nums1[nums1.length-1-k]=temp;
            k++;
        }


        int ptr=n;
        int i=0;
        int j=0;
        while(ptr<nums1.length && i<n){
            if(nums1[ptr]<=nums2[i]){
               nums1[j]=nums1[ptr];
               ptr++;
               j++;
            }else{
                nums1[j]=nums2[i];
                i++;
                j++;
            }
        }

        while(i<n){
            nums1[j]=nums2[i];
            i++;
            j++;
        }

        while(ptr<nums1.length){
            nums1[j]=nums1[ptr];
            ptr++;
            j++;
        }

        //Integer[] objects = (Integer[])nums1List.toArray();


    }

    public static void main(String[] args) {
        MergeSortedListv2 mergeSortv2=new MergeSortedListv2();
        int[] nums1=new int[]{1,2,3,0,0,0};
        mergeSortv2.merge(nums1,3,new int[]{2,5,6},3);
        for(int num:nums1)
            System.out.println(num);
    }


}
