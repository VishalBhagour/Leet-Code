class Solution {
    public int distinctAverages(int[] nums) {
        int n=nums.length;
        HashSet<Integer>h=new HashSet<>();
        Arrays.sort(nums);
        for(int i=0;i<n;i++){
            int sum=nums[i]+nums[n-1-i];
            h.add(sum);
        }
        return h.size();
    }
}