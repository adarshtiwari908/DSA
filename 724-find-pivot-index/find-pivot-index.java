class Solution {
    public int pivotIndex(int[] nums) {
        int totalSum = 0;
        for (int num : nums) {
            totalSum += num;
        }

        int leftSum = 0;
        for (int i = 0; i < nums.length; i++) {
            // check if leftSum is equal to rightSum
            if (leftSum == totalSum - leftSum - nums[i]) {
                return i; // pivot found
            }
            leftSum += nums[i]; // update leftSum for next index
        }

        return -1; // no pivot index
    }
}
