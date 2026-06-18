import java.util.*;

class Solution {
    public ArrayList<Integer> sortColors(int[] arr) {
        ArrayList<Integer> result = new ArrayList<>();
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        for (int i = 0; i < arr.length; i++) {
            result.add(arr[i]);
        }
        return result;
    }
}
