class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> res= new ArrayList<>();
        helper(nums,res,0,new ArrayList<Integer>());
        return res;
    }

    public void helper(int[] nums ,List<List<Integer>> res , int index,List<Integer> current){
        res.add(new ArrayList<>(current));
        for ( int i =index; i<nums.length;i++){
            current.add(nums[i]);
            helper(nums,res,i+1,current);
            current.remove(current.size()-1);
        }

    }
}

//[1,2,3]
/* 
[]
[1]
[1,2]
[1,3]
[1,2,3]
[2]
[2,3]
[3]
*/