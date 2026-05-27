class Solution {
    public int numberOfSpecialChars(String word) {
        int n = word.length() ;
        int[] last = new int[26];
        int[] first = new int[26];

        for(int i=0; i<26;i++){
            last[i] =-1;
            first[i]=-1;
        } 

        for(int i=0; i<n; i++){
            int ele = word.charAt(i);
            if(Character.isUpperCase(ele)){
                if(first[ele-'A']==-1){
                    first[ele-'A']=i;
                }
            }
            else{
                last[ele-'a'] = i;
            }
        }
        int count =0;
        for(int i =0; i<26;i++){
            if(last[i]!=-1 && first[i]!=-1){
                if(last[i]<first[i])count++;
            }
        }
        return count;
    }
}