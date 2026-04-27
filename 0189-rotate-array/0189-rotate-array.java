class Solution {
        public static void rotate(int[] num, int k) {
        int n=num.length;
        k = k % n;
        reverse(num, 0, n-k-1);
        reverse(num,  n-k ,n- 1);
        reverse(num, 0, n-1);
    }

    public static void reverse(int[] num, int left, int right) {
        while (left < right) {
            int temp = num[left];
            num[left] = num[right];
            num[right] = temp;
            left++;
            right--;
        }
    }
}
