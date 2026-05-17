class Solution {
    public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals, (a,b) -> Integer.compare(a[0], b[0]));
        int n = intervals.length;
        List<List<Integer>> list = new ArrayList<>();
        for(int i =0;i<n;i++){
            int start = intervals[i][0];
            int end = intervals[i][1];
            while(i!=n-1 && intervals[i+1][0]<=end){
                end=Math.max(intervals[i+1][1],end);
                i++;
            }
            
            list.add(Arrays.asList(start,end));
        }
        int[][] ans = new int[list.size()][2];
        int i=0;
        for(List<Integer> l : list){
            ans[i][0]=l.get(0);
            ans[i][1]=l.get(1);
            i++;
        }

        return ans;
    }
}