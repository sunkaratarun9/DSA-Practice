class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        int small =Integer.MAX_VALUE;
        int large =Integer.MIN_VALUE;
        for(int i : nums){
            small=Math.min(small,i);
            large=Math.max(large,i);
        }

        Set<Integer> s = new HashSet<>();

        for(int j:nums){
            s.add(j);
        }
        List<Integer> li =  new ArrayList<>();
        for(int i=small;i<=large;i++){
            if(s.contains(i)){

            }
            else{
                li.add(i);
            }
        }
        return li;
    }
}