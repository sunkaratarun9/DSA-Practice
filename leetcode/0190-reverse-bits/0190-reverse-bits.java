class Solution {
    public int reverseBits(int n) {
        String s="";
        for(int i=0;i<32;i++){
            int bits=(n>>i)&1;
            s+=Integer.toString(bits);
        }
        int res=Integer.parseInt(s,2);
        return res;
    }
}