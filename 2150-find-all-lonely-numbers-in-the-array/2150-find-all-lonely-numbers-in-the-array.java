class Solution {
    public List<Integer> findLonely(int[] nums) {
        List<Integer> ans = new ArrayList<>();
        Map<Integer, Integer> countmap = new HashMap<>();
        for (int num : nums) {
            countmap.put(num, countmap.getOrDefault(num, 0) + 1);
        }
        for(int num : nums){
            if(countmap.get(num) == 1 && !countmap.containsKey(num-1) && !countmap.containsKey(num+1)){
                ans.add(num);
            }
        }
        return ans;
        
    }
}