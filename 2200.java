import java.util.*;

class Solution{
    public List<Integer> findKDistanceIndeices(int[] nums, int key, int k){
        List<Integer> result = new ArrayList<>();
        List<Integer> keyIndices = new ArrayList<>();

        for(int i=0; i<nums.length; i++){
            if(nums[i] == key){
                keyIndices.add(i);
            }
        }

        boolean[] valid = new boolean[nums.length];
        for(int index : keyIndices){
            int start = Math.max(0, index - k);
            int end = Math.min(nums.length-1, index+k);

            for(int i=start; i<end; i++){
                valid[i] = true;
            }
        }

        for(int i=0; i<valid.length; i++){
            if(valid[i]) result.add(i);
        }

        return result;
    }
}