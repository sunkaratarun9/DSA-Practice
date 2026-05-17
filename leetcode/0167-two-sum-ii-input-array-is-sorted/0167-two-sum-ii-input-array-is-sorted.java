class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int i=0,j=numbers.length-1;
        while(i<j){
            int twosum=numbers[i]+numbers[j];
            if(twosum==target){
                return new int[] {i+1,j+1};
            }
            if(twosum<target){
                i++;
            }
            else{
                
                j--;
            }
        }
        return new int[] {};
    }
}