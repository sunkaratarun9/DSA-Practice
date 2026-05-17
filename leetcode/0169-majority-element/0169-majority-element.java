class Solution {
    //using HashMap<>()
    // public int majorityElement(int[] nums) {
    //     HashMap<Integer,Integer> map = new HashMap<>();
    //     int ans = 0;
    //     int n = nums.length;
    //     for(int i : nums){
    //         map.put(i,map.getOrDefault(i,0)+1);
    //         if( map.get(i)>(n/2) ){
    //             return i ;
    //         }
    //     }
    //     return ans;
    // }

    //using Moore's Voting Algorithm
    public int majorityElement(int[] nums) {
        int n =nums.length;
        int count=0,ele=0;
        
        for(int i =0; i<n ;i++){
            if(count==0){
                ele= nums[i];
            }
            if(ele==nums[i]){
                count++;
            }
            else{
                count--;
            }

        }
        return ele;
    }
}