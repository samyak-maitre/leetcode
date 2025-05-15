import java.util.*;

class Solution{
    public static List<String> getLongestSubsequence(String[] words, int[] groups){
        List<String> result  = new ArrayList<>();
        int lastGroup = groups[0];
        result.add(words[0]);
        for(int i=1; i<words.length; i++){
            if(lastGroup != groups[i]){
                result.add(words[i]);
            }
        }

        return result;
    }
}