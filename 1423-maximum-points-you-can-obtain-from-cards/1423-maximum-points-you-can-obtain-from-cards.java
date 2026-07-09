class Solution {
    public int maxScore(int[] cardPoints, int k) {
        int left = 0;
        for(int i=0;i<k;i++) {
            left += cardPoints[i];
        }
        int right = 0;
        int m = cardPoints.length-1;
        int maxSum = left;
        for(int j=k-1;j>=0;j--) {
            right += cardPoints[m];
            m--;
            left -= cardPoints[j];
            maxSum = Math.max(maxSum,left+right);
        }
        return maxSum;
    }
}