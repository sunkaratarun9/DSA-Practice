class Solution {
    public String reverseWords(String s) {
        String[] words = s.trim().split("\\s+");

        List<String> wordList = Arrays.asList(words);
        Collections.reverse(wordList);

        
        String res = "";
        for (String word : wordList) {
            res += word + " ";  
        }

        return res.trim(); 
    }
}