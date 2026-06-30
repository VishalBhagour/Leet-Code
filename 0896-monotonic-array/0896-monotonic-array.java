class Solution {
    public boolean isMonotonic(int[] arr) {
        int inc=0,dec=0,equi=0;
        for(int i=1;i<arr.length;i++){
            if(arr[i]>arr[i-1]) inc++;
            else if(arr[i]<arr[i-1]) dec++;
            else equi++;
        }
        if((inc+equi)==arr.length-1 || (dec+equi)==arr.length-1) return true;
        return false;
    }
}