import java.util.*;

// class Solution {
//     public void merge(int[] nums1, int m, int[] nums2, int n) {
//         int i1 =m ; int i2 = 0;
//         for(int i=0; i<n; i++){
//             if(nums1[i1]==0) nums1[i1++] = nums2[i2++];
//         }
//         Arrays.sort(nums1);
//     }
// }

class Solution{
    public void merger(int[] nums1, int m, int nums2[], int n){
        int i = m-1;
        int j = n-1;
        int k = m+n -1;

        //merge in reverse order
        while(i>=0 && j>=0){
            if(nums1[i] > nums2[j]){
                nums1[k--] = nums1[i--];
            } else {
                nums1[k--] = nums2[j--];
            }
        }

        while(j >= 0){
            nums1[k--] = nums2[j--];
        }
    }
}