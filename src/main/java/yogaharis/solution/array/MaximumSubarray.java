package yogaharis.solution.array;

public class MaximumSubarray {

    public int maxSubArray(int[] nums) {
        if (nums == null || nums.length == 0) throw new IllegalArgumentException();
        int currentSum = 0;
        int maxSum = nums[0];
        for (var num : nums){
            currentSum = Math.max(num, currentSum + num);
            maxSum = Math.max(currentSum, maxSum);
        }
        return maxSum;
    }
}
