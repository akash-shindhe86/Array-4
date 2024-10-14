// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : used the same logic Jaspinder explained in the class.

package Array-4;

public class Problem3 {
    public void nextPermutation(int[] nums) {
        if(nums == null) return;
        int n = nums.length;
        int i = n -2;
        //find the breaching digit which can be swapped.
        while(i >=0 && nums[i] >= nums[i+1]){ //O(n)
            i--;
        }

        if(i != -1){ //O(n)
            //swap the breached didigt with just greater digit
            int j = n -1;
            while(nums[j] <= nums[i]){
                j--;
            }
            swap(nums, i, j);
        }
        //reverse the digits after breached till the end
        reverse(nums,i+1, n-1); //O(n)
    }

    private void reverse(int nums[], int i, int j){
        while(i < j){
            swap(nums,i,j);
            i++;
            j--;
        }
    }

    private void swap(int nums[], int i , int j){
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}
