class Solution {
    public int maximumValue(String[] strs) {
        int max = 0;
        for(int i = 0;i<strs.length;i++){
            int count =0 ;
            char[]s = strs[i].toCharArray();
            for(char ch : s){
                if('a'<=ch && 'z'>=ch){
                    count++;
                    break;
                }
            }
            int p = 0;
            if(count == 0) p = Integer.parseInt(strs[i]);
            else p = strs[i].length();
            max = Math.max(max,p);
        }
        return max;
    }
}