class Solution {

    public int square(int num){
        int sum=0;
        while(num>0){
            int rem = num%10;
            sum+=rem*rem;
            num=num/10;
        }
        return sum;
    }
    public boolean isHappy(int n) {
        int slow=n,fast=n;
        do{
            slow=square(slow);
            fast=square(square(fast));
        }while(slow!=fast);
        if(slow==1)
             return true;
        return false;
    }
}