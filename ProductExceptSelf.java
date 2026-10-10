import java.util.Arrays;

class ProductExceptSelf {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4};
        int n = nums.length, p = 1;
        int[] ans = new int[n];

        for (int i = 0; i < n; i++) {
            ans[i] = p;
            p *= nums[i];
        }

        p = 1;
        for (int i = n - 1; i >= 0; i--) {
            ans[i] *= p;
            p *= nums[i];
        }

        System.out.println(Arrays.toString(ans));
    }
}
