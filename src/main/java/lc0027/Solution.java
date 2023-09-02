package lc0027;

class Solution {
    public int removeElement(int[] nums, int val) {
        final int len = nums.length;

        int k = -1;
        for( int i = 0; i < len; i++ ) {
            if(nums[i] != val) {
                nums[k+1] = nums[i];
                k++;
            }
        }

        return k+1;
    }
}