class Solution {
    public int gcd(int a, int b)
    {
        int i;
        if (a<b )
            i= a;
        else
            i= b;
        for (i=i;i>1;i--) {

            if (a%i == 0 && b%i == 0)
                return i;
        }
        return 1;
    }
    public int gcdOfOddEvenSums(int n) {
        int odd =n*n;
        int even=n*(n+1);
        return gcd(odd,even);
    }
}