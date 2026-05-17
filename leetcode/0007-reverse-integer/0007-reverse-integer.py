class Solution:
    def reverse(self, x: int) -> int:
        rs=0
        # if (-2**31 <= n) and (n <= 2**31 -1 ):
        if x<0:
            x=x*-1
            x=str(x)
            m=x[::-1]         #negative sign
            rs= -(int(m))
        else:
            x=str(x)
            m=x[::-1]         #positive sign
            rs= int(m)
        
        if rs >= (2**31 - 1) or rs <= (-2**31):
            return 0
        else:
            return rs