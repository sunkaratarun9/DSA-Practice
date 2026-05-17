class Solution {
    public int lengthOfLastWord(String s) {
        String Arr[] = s.split(" ");//toStringArray();
        //int size=Arr.length;
        //return Arr[size-1].length;
        String lsw = Arr[Arr.length-1];
        int len = lsw.length();
        return len;
        
    }
}