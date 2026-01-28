class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        ArrayList<Integer> arr = new ArrayList<>();
        Arrays.sort(nums);
        for(int i=1;i<nums.length;i++){
            if(nums[i-1] == nums[i]){
               arr.add(nums[i]);
            }
            else{
                continue;
            }
        }
        return arr;
    }
}