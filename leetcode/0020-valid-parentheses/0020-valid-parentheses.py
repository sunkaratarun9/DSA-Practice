class Solution(object):
    def isValid(self, s):
        """
        :type s: str
        :rtype: bool
        """
        r=[]
        
        for i in s:
            if i == '(' or i == '{' or i=='[':
                r.append(i)
            else:
                try:
                    if i == ')' and r[-1]=='(' :
                        r.pop()
                    elif i == '}' and r[-1]=='{' :
                        r.pop()
                    elif i == ']' and r[-1]=='[' :
                        r.pop()
                    else :
                        return False
                except Exception:
                    return False
#             elif i == '{':
#                 r.append(i)
                
#             elif i=='[':
#                 r.append(i)
                
                
        return r == []
        
        
        # i=0
        # j=0
        # k=0
        # for i in range(len(s)):
        #     if s[i] == '(' :
        #         i+=1
        #     if s[i] ==  '[' :
        #         j+=1
        #     if s[i] ==  '{':
        #         k+=1
        #     if s[i] == ')' :
        #         i-=1
        #     if s[i] ==  ']' :
        #         j-=1
        #     if s[i] ==  '}':
        #         k-=1
        # if i==0 and j==0 and k==0:
        # # if (i&j&k) ==0:
        #     return True
        # else:
        #     return False
        # rs=[]
        # for i in range(len(s)):
        #     if s[i] == '(' or s[i] == '[' or s[i] == '{':
        #         rs.append(s[i])
        #     elif s[i] in ')]}':
        #         if s[i] == ')' and rs[-1]=='(':
        #             rs.append(s[i])
        #         elif s[i] == '[' and rs[-1]==']':
        #             rs.append(s[i])
        #         elif s[i] == '{' and rs[-1]=='}':
        #             rs.append(s[i])
        #         else:
        #             return False
        #     # else:
        #     #     return False 
        # return True
        
        
                
                
        