import java.util.*;

class Solution {
    public int[] relativeSortArray(int[] arr1, int[] arr2) {
        ArrayList<Integer> ans1 = new ArrayList<>();
        ArrayList<Integer> ans2 = new ArrayList<>();
        for (int i : arr1) {
            ans2.add(i);
        }
        for (int x : arr2) {
            for (int i = 0; i < ans2.size();) {
                if (ans2.get(i) == x) {
                    ans1.add(x);
                    ans2.remove(i);
                } 
                else{
                    i++;
                }
            }
        }
        Collections.sort(ans2);
        ans1.addAll(ans2);
        int[] result = new int[ans1.size()];
        for (int i = 0; i < ans1.size(); i++) {
            result[i] = ans1.get(i);
        }
        return result;
    }
}
