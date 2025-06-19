class Solution{
    public static int lengthOfWord(String s){
        s = s.trim();
        int IndexOfLastSpace = s.indexOf(" ");
        return s.length()-1-IndexOfLastSpace;
    }
}