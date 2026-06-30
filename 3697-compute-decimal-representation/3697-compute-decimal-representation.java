class Solution {
    public int[] decimalRepresentation(int n) {
        int mod = 1;
        ArrayList<Integer>ans = new ArrayList<>();
        while(n!=0){
            int p = n%mod;
            if(p!=0) ans.add(p);
            n-=p;
            mod*=10;
        }
        int[] arr = new int[ans.size()];
        int size = ans.size();
        for (int i = 0; i < size; i++) {
            arr[i] = ans.get(size - 1 - i);
        }
        return arr;

    }
}