import java.util.*;

class SubarraySumK {
    public static void main(String[] args) {
        int[] a = {1, 1, 1};
        int k = 2, sum = 0, count = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0, 1);

        for (int x : a) {
            sum += x;
            count += map.getOrDefault(sum - k, 0);
            map.put(sum, map.getOrDefault(sum, 0) + 1);
        }

        System.out.println(count);
    }
}
