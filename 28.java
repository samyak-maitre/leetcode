// class Solution{
//     public int strStr(String haystack, String needle){
//         if(needle.isEmpty()){
//             return 0;
//         }

//         return haystack.indexOf(needle);
//     }
// }

class Solution{
    public int strStr(String h, String n){
        if(n.isEmpty()) return 0;
        return h.indexOf(n);
    }
}