// Time Complexity : O(n) 
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : used the same logic Jaspinder explained in the class.

package Array-4;

public class Problem2 {
    public int maxSubArray(int[] nums) {
        int rSum = nums[0];
        int max = nums[0];
        int start = 0, end = 0;
        int cStart = 0;
        for(int i = 1; i <nums.length; i ++){
            // rSum = Math.max(rSum + nums[i], nums[i]);
            if(rSum + nums[i] > nums[i]){
                rSum = rSum + nums[i];
            }else{
                rSum = nums[i];
                cStart = i;
            }
            
            if(rSum > max){
                start = cStart;
                end = i;
                max = rSum;
            }
        }
        return max;
    }
}
