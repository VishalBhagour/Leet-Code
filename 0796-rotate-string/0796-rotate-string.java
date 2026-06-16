class Solution {
    public boolean rotateString(String s, String goal) {
        if(s.length()!=goal.length()) return false;
        StringBuilder ans = new StringBuilder();
        int n = s.length();
        for(int i=0;i<n;i++){
            ans.append(s.substring(i,n));
            ans.append(s.substring(0,i));

            if(ans.toString().equals(goal)) return true;
            ans.setLength(0);
        }
        return false;
        
    }
}