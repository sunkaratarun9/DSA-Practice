import java.util.HashMap;
class Solution {
    public boolean isIsomorphic(String s, String t) {
        HashMap<Character, Character> smap = new HashMap<>();
        HashMap<Character, Character> tmap = new HashMap<>();
        for ( int i=0; i<=s.length()-1;i++){
            char charS = s.charAt(i);
            char charT = t.charAt(i);
            if(smap.containsKey(charS)){
                if (smap.get(charS) != charT) {
                    
                
                
                    return false;
                }
            } else{
                if(tmap.containsKey(charT)){
                    return false;
                    
                }
                smap.put(charS, charT);
                tmap.put(charT, charS);
            }
            
        }
        return true;
    }
}