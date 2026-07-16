class Solution {
    public long gcdSum(int[] nums) {
        List<Long>l=new ArrayList<>();
        long max=0;
        for(int i=0;i<nums.length;i++){
            max=Math.max(max,nums[i]);
            l.add(gcd(max,nums[i]));
        }
        Collections.sort(l);
        if(l.size()%2==1) l.remove(l.size()/2);
        long sum=0;
        for(int i=0;i<l.size()/2;i++){
            sum+=gcd(l.get(i),l.get(l.size()-1-i));
        }
        return sum;
    }
    private long gcd(long a, long b){
        while(b!=0){
            long temp=b;
            b=a%b;
            a=temp;
        }
        return a;
    }
}