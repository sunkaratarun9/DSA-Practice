class Solution {
    public boolean works(int[] bloom , int day , int m ,int k){
        int count=0;
        long requiredDays =0;
        for(int i: bloom){
            // here only the less or equal days are counted
            if(i<=day){
                count++;
            }
            else{
                requiredDays += (count/k)  ;
                count=0;
            }
        }
        requiredDays += (count/k);
        return requiredDays>=m;
    }
    public int minDays(int[] bloomDay, int m, int k) {
        int low = 0;
        int high = 0;
        for(int i : bloomDay){
            high = Math.max(high,i);
        }
        int ans =-1;
        while(low<=high){
            int mid = low+(high-low)/2 ;
            boolean j = works(bloomDay,mid,m,k) ;
            if(j){
                ans = mid;
                high= mid-1;
            }
            else{
                low=mid+1;
            }
        }

        return ans;
    }
}