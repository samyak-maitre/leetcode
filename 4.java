import java.util.*;

class Solution{
    public double findMedianSortedArrays(int[] nums1, int[] nums2){
        int n1 = nums1.length;
        int n2 = nums2.length;
        int[] merged = new int[n1+n2];
        int p1 = 0, p2 = 0, p=0;

        while(p1<n1 && p2 <n2){
            if(nums1[p1] < nums2[p2]){
                merged[p++] = nums1[p1++];
            }else{
                merged[p++] = nums2[p2++];
            }
        }

        while(p1<n1){
            merged[p++] = nums1[p1++];
        }
        while(p2 < n2){
            merged[p++] = nums2[p2++];
        }

        int total = n1+n2;
        if(total %2 ==1){
            return merged[total/2];
        }else {
            return (merged[total/2 -1] + merged[total/2])/2.0;
        }
    }
}