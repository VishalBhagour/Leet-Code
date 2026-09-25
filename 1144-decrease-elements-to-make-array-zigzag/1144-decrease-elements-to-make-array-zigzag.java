class Solution {
    public int movesToMakeZigzag(int[] nums) {
        return Math.min(calculate(nums, 0), calculate(nums, 1));
    }
    private int calculate(int[] nums, int start) {
        int moves = 0;
        for (int i = start; i < nums.length; i += 2) {
            int left = i > 0 ? nums[i - 1] : Integer.MAX_VALUE;
            int right = i < nums.length - 1 ? nums[i + 1] : Integer.MAX_VALUE;
            int minNeighbor = Math.min(left, right);
            if (nums[i] >= minNeighbor) {
                moves += nums[i] - minNeighbor + 1;
            }
        }
        return moves;
    }
}