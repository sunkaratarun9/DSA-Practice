class Solution {
    public void recursion(ArrayList<Integer> list,int ele){
        if (ele<=0){
            return;                            
        }
        int last=ele%10;
        ele/=10;
        recursion(list,ele);
        list.add(last);
    }
    public int[] separateDigits(int[] nums) {
        ArrayList<Integer> list = new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            int ele = nums[i];
            recursion(list,ele);
        }
        int[] ans= new int[list.size()];
        for(int i=0; i<list.size();i++){
            ans[i]=list.get(i);
        }
        return ans;
    }
}