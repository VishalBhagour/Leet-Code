class Solution {
    public boolean checkOnesSegment(String s) {
        int count = 0;
        boolean valid=true;
        char[] arr = s.toCharArray();
        for(int i=0;i<s.length();i++){
            if(arr[i] == '1'){
                if(valid==false) return false;
                count++;
            }
            else if(arr[i] == '0'){
                count = 0;
                valid = false;
            }
        }
        return true;
    }
}