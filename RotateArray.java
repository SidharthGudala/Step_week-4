import java.util.Arrays;

class RotateArray {
    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4, 5, 6, 7};
        int k = 3, n = a.length;
        k %= n;

        int[] b = new int[n];

        for (int i = 0; i < n; i++)
            b[(i + k) % n] = a[i];

        System.out.println(Arrays.toString(b));
    }
}
