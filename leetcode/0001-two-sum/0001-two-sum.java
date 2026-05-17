import java.util.*;

class Solution {

    //using two pointers
    public int[] twoSum(int[] nums, int target) {
        int n = nums.length ;
        int arr[][] = new int[n][2];
        //storing nums values,index
        for(int i=0;i<n;i++){
            arr[i][0]=nums[i];
            arr[i][1]=i;
        }
        Arrays.sort(arr, (a, b) -> a[0] - b[0]);
        int left =0,right =n-1;
        
        while(left < right){
            int sum = arr[left][0]+arr[right][0];
            if(sum==target){
                return new int[]{
                    arr[left][1],
                    arr[right][1]
                };
            }
            else if(sum<target){
                left++;
            }
            else{
                right--;
            }
        }
        return new int[]{};
    }
    //Using HashMap
    // public int[] twoSum(int[] nums, int target) {
    //     HashMap<Integer,Integer> map = new HashMap<>();
    //     map.put(nums[0],0);

    //     int[] ans = new int[2];
    //     for(int i =1; i<nums.length; i++){
    //         int rem = target-nums[i] ;
    //         if(map.containsKey(rem)){
    //             ans[0] =map.get(rem) ;
    //             ans[1] =i ;
    //             return ans;
    //         }
    //         map.put(nums[i],i);
    //     }
    //     return ans;
    // }
    /* Brute-force */
    // public int[] twoSum(int[] nums, int target) {
    //     int n = nums.length;
    //     int i=0;
    //     int j=i+1;
    //     int[] ans = new int[2];
    //     while(i<n-1 ){
    //         j=i+1;
    //         while(j<n){
    //             if(nums[i]+nums[j] == target){
    //                 ans[0] = i;
    //                 ans[1] = j ;
    //                 return ans;
    //             }
    //             j++;
    //         }
    //         i++;
    //     }
    //     return ans;
    // }
}