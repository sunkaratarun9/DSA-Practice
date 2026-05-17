class Solution {
    public int findMaxConsecutiveOnes(int[] arr) {
        int i=0;
        int n=arr.length;
        int c=0;
        int ans = Integer.MIN_VALUE;
        while(i<n){
            if(arr[i]==1){
                c++;
            }
            else{
                c=0;
            }
            i++;
            ans = (ans<=c)?c:ans; 
        }
        return ans;
    }
}