class Solution {
    public static String removeLast(String result){
        if (result == null || result.isEmpty()) {
            return result;
        }

        return result.substring(0,result.length()-1);
    } 
    public static String reverseString(String original) {
        String reversed = ""; 
        
        for (int i = 0; i < original.length(); i++) {
            char letter = original.charAt(i);
            
            reversed = letter + reversed; 
        }
        
        return reversed;
    }
    public String processStr(String s) {
        String result = "";
        for(int i=0; i<s.length();i++){
            char curr = s.charAt(i); 
            if(curr >= 'a' && curr <= 'z'){
                result += curr;
            }
            else if(curr == '*'){
                // remove last char
                result = removeLast(result);
            }
            else if(curr == '#'){
                // append result to itself
                result+=result;
            }
            else if(curr == '%'){
                // reverse the result
                result=reverseString(result);
            }
        }
        return result;
    }
}