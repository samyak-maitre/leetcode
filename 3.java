import java.util.*; 

class Solution {
    public int lengthOfLongestSubstring(String s) {
        int result = 0;
        HashMap<Character, Integer> map = new HashMap<>(); 
        for(int i=0; i<s.length(); i++){
            int count = 0;
            map.clear();
            for(int j=i; j<s.length(); j++){
                if(map.containsKey(s.charAt(j))) break;
                map.put(s.charAt(j),1);
                count++;
            }
            result = Math.max(result, count);
        }

        return result;
    }
}