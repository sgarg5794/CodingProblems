package Arrays;

public class RotateArray {

    public void rotate(int[] nums, int k) {
        //if we rotate length times then it will give the same array so this step
        k%=nums.length;
        int len=nums.length-k;
        //reverse an array
        reverse(nums,0,nums.length-1);
        //reverse first k
        reverse(nums,0,k-1);
        //reverse k-length-1
        reverse(nums,k,nums.length-1);
    }

    public void reverse(int[] nums, int start,int end){
        while(start<end){
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }
    }
}
