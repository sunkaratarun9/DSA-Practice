class Solution 
{
    public int fun(int[] bloomDay, int mid, int k)
    {
        int cnt=0;
        int ans=0;
        for(int i=0;i<bloomDay.length;i++)
        {
            if(bloomDay[i]<=mid) cnt++;
            else
            {
                ans+=cnt/k;
                cnt=0;
            }
        }
        return ans+(cnt/k);
    }
    public int minDays(int[] bloomDay, int m, int k) 
    {
        int l=1;
        int r=Integer.MIN_VALUE;
        for(int i=0;i<bloomDay.length;i++)
        {
            r=Math.max(r,bloomDay[i]);
        }
        int s=r;
        while(l<=r)
        {
            int mid=l+(r-l)/2;
            int x=fun(bloomDay,mid,k);
            if(x>=m) r=mid-1;
            else l=mid+1;
        }
        if(l>s) return -1;
        return l;
    }

}