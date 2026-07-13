class Solution {
    public String triangleType(int[] nums) {
        int n = nums[0];
        if (nums[0] + nums[1] <= nums[2] || 
            nums[0] + nums[2] <= nums[1] || 
            nums[1] + nums[2] <= nums[0]) {
            return "none";
        }
        if(nums[0] == n && nums[1] == n && nums[2]==n){
            return "equilateral";
        }
        if (nums[0] == nums[1] || nums[1] == nums[2] || nums[0] == nums[2]) {
            return "isosceles";
        }
        return "scalene";
    }
}