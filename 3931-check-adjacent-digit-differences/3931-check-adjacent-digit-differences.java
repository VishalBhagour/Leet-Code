class Solution {
    public boolean isAdjacentDiffAtMostTwo(String s) {
        ArrayList<Integer> ans = new ArrayList<>();
        char [] num = s.toCharArray();
        for (char c : num) {
            ans.add(Character.getNumericValue(c));
        }
        for(int i=0;i<ans.size()-1;i++){
            if (Math.abs(ans.get(i) - ans.get(i + 1)) > 2){
                return false;
            }
        }
        return true;
    }
}