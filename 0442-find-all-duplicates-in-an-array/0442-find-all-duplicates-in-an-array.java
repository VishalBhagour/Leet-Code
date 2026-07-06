class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        ArrayList<Integer> ans = new ArrayList<>();
        HashMap<Integer,Integer> arr = new HashMap<>();
        for(int i: nums){
            arr.put(i,arr.getOrDefault(i,0)+1);
        }
        for(int i:arr.keySet()){
            if(arr.get(i)==2){
                ans.add(i);
            }
        }
        return ans;
    }
}