class Solution {
    public boolean isIsomorphic(String s, String t) {
        HashMap<Character,Character> ans1 = new HashMap<>();
        HashMap<Character,Character> ans2 = new HashMap<>();
        for(int i=0;i<s.length();i++){
            char cs = s.charAt(i);
            char ct = t.charAt(i);
            if(ans1.containsKey(cs)){
                if(ans1.get(cs)!=ct) return false;
            }
            ans1.put(cs,ct);
            if(ans2.containsKey(ct)){
                if(ans2.get(ct)!=cs) return false;
            }
            ans2.put(ct,cs);
        }
    return true;
    }
}