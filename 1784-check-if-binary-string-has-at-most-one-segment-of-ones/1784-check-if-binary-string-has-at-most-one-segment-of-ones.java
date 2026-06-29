class Solution {
    public boolean checkOnesSegment(String s) {
        boolean valid=true;
        for(char ch:s.toCharArray()){
            if(ch == '1'){
                if(valid==false) return false;
            }
            else if(ch == '0'){
                valid = false;
            }
        }
        return true;
    }
}