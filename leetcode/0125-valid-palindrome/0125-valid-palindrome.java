class Solution {
    public static boolean palindrome(String s, int l, int r){
        if(l>=r) return true;
        while(l<r && !Character.isLetterOrDigit(s.charAt(l))){
            l++;
        }
        while(l<r && !Character.isLetterOrDigit(s.charAt(r)) ){
            r--;
        }
        if(s.charAt(l)!=s.charAt(r)){
            return false;
        }
        return palindrome(s,l+1,r-1);
    }
    public boolean isPalindrome(String s) {
        boolean ans = palindrome(s.toLowerCase(),0,s.length()-1);
        return ans;
    }
}