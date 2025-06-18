import java.util.*; 

class Solution {
    public int lengthOfLongestSubstring(String s) {
        int n = s.length();
        int maxLength = 0;
        int left = 0;
        HashSet<Character> seen = new HashSet<>();

        for(int right = 0; right<n; right++){
            char currentChar = s.charAt(right);

            while(seen.contains(currentChar)){
                seen.remove(s.charAt(left));
                left++;
            }
        }
    }
}