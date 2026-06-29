class Solution {
    public boolean checkRecord(String s) {
        char [] arr = s.toCharArray();
        int countA = 0;
        int countL = 0;
        for(int i=0;i<s.length();i++){
            if(arr[i] == 'A'){
                countA++;
                if(countA==2) return false;
                countL=0;
            }
            else if(arr[i] == 'L'){
                countL++;
                if(countL==3) return false;
            }
            else countL=0;
        }
        return true;
    }
}