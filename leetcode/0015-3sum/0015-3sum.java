class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> list = new ArrayList<>();
        Arrays.sort(nums);
        int n = nums.length; 
        for(int i=0;i<n;i++){
            if(i>0 && nums[i]==nums[i-1]) continue;
            int j = i+1;
            int k = n-1;
            while(j<k){
                int sum = nums[i]+nums[j]+nums[k];
                if(sum<0){
                    j++;
                }
                else if(sum>0){
                    k--;
                }
                else{
                    list.add(Arrays.asList(nums[i], nums[j], nums[k]));
                    j++;
                    k--;
                    while(j<k && nums[j-1]==nums[j]){
                        j++;
                    }
                    while(j<k && nums[k+1]==nums[k]){
                        k--;
                    }
                }
            }
        }
        return list;
    }
    // public List<List<Integer>> threeSum(int[] nums) {
    //     Set<List<Integer>> set = new HashSet<>();
    //     for(int i =0;i<nums.length-1;i++){
    //         Set<Integer> map = new HashSet<>();
    //         for(int j=i+1;j<nums.length;j++){
    //             if(map.contains(-(nums[i]+nums[j]))){
    //                 List<Integer> temp = Arrays.asList(nums[i],nums[j],(-(nums[i]+nums[j])));
    //                 Collections.sort(temp);
    //                 set.add(temp);
    //             }
    //             map.add(nums[j]);
    //         }
    //     }
    //     List<List<Integer>> list = new ArrayList<>();
    //     for(List<Integer> i:set){
    //         list.add(i);
    //     }
    //     return list;
    // }
    // public List<List<Integer>> threeSum(int[] nums) {
    //     Set<List<Integer>> set = new HashSet<>();
    //     int n = nums.length;
    //     for(int i=0;i<n-2;i++){
    //         for(int j=i+1;j<n-1;j++){
    //             for(int k=j+1;k<n;k++){
    //                 if(nums[i]+nums[j]+nums[k]==0){
    //                     List<Integer> temp = Arrays.asList(nums[i], nums[j], nums[k]);
    //                     Collections.sort(temp);
    //                     set.add(temp);
    //                 }
    //             }
    //         }
    //     }
    //     List<List<Integer>> list= new ArrayList<>();
    //     for(List<Integer> i: set){
    //         list.add(i);
    //     }
    //     return list;
    // }
}