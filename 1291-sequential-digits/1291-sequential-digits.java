class Solution {
    public List<Integer> sequentialDigits(int low, int high) {
        ArrayList<Integer> ans = new ArrayList<>();
        for(int i=1;i<=9;i++){
            StringBuilder l = new StringBuilder();
            l.append(i);
            for(int j=i+1;j<=9;j++){
                l.append(j);   
                int num = Integer.parseInt(l.toString());
                if (num >= low && num <= high) {
                    ans.add(num);
                }
            }    
        }
        Collections.sort(ans);
        return ans;
    }
}