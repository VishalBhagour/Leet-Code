class Solution {
    public boolean isMonotonic(int[] arr) {
        boolean inc=true,dec=true;
        for(int i=1;i<arr.length;i++){
            if(arr[i]>arr[i-1]) dec = false;;
            if(arr[i]<arr[i-1]) inc = false;
        }
        return inc || dec;
    }
}