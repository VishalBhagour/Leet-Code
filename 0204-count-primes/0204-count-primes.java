class Solution {
    public int countPrimes(int n) {
        if(n==0 || n==1){
            return 0;
        }
        boolean[] check = new boolean[n];
        int count = 0;
        for(int i=2;i<n;i++){
            if(check[i]==true) continue;
            count++;
            for(long j=(long)i*i;j<n;j+=i){
                check[(int)j] = true;
            }
        }
        return count;
    }
}