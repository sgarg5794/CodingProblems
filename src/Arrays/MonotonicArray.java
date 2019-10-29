package Arrays;

//An array is monotonic if it is either monotone increasing or monotone decreasing.
//An array A is monotone increasing if for all i <= j, A[i] <= A[j].  An array A is monotone decreasing if for all i <= j, A[i] >= A[j].
//Return true if and only if the given array A is monotonic.

public class MonotonicArray {
    public boolean isMonotonic(int[] A) {
        int i=1;
        int j=1;
        boolean status=true;
        boolean status1=true;
        while(i<A.length){
            if(A[i]>A[i-1]){
                status=false;
                break;
            }
            i++;
        }
        while(j<A.length){
            if(A[j]<A[j-1]){
                status1=false;
                break;
            }
            j++;
        }
        return status1||status;
    }

}
