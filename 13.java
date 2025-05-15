import java.util.*;

class Solution{
    public static int romanToInt(String s){
        HashMap<Character, Integer> myMap = new HashMap<>();
        myMap.put('I',1);
        myMap.put('V',5);
        myMap.put('X',10);
        myMap.put('L',50);
        myMap.put('C',100);
        myMap.put('D',500);
        myMap.put('M',1000);
        int result = 0;
      
        for(int i=0; i<s.length(); i++){
           int curr = myMap.get(s.charAt(i));

           if( i + 1 < s.length() && curr < myMap.get(s.charAt(i+1))){
            result -= curr;
           } else {
            result += curr;
           }
        }
        return result;
    }
}



