package amz;

public class LongestPalindromeSubstring {

    public String longestPalindrome(String input) {
        if(input==null || input.length()<1) return "";
        int start=0,end=0;
        for (int i=0;i<input.length();i++){
            int len1=checkAroundCentre(input,i,i);
            int len2=checkAroundCentre(input,i,i+1);
            int len=Math.max(len1,len2);
            if(len>end-start){
                start=i-(len-1)/2;
                end=i+len/2;
            }
        }
        return input.substring(start,end+1);
    }

    public int checkAroundCentre(String input,int left,int right){
        while(left>=0 && right<input.length() && input.charAt(left)==input.charAt(right)){
            left--;
            right++;
        }
        //give palindrome string length between left and right
        return right-left-1;

    }
}
