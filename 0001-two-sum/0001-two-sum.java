class Solution {
    public int[] twoSum(int[] nums, int target) {
        //////////////////by hash map///////////////////
        int k[]= new int[2];
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int x = target - nums[i];
        
            if (map.containsKey(x)) {
                k[0] = map.get(x);
                k[1] = i;
                break;
            }
            map.put(nums[i], i);
        }
        return k;
    }
}