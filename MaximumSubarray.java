class MaximumSubarray {
    public static void main(String[] args) {
        int[] a = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        int sum = a[0], max = a[0];

        for (int i = 1; i < a.length; i++) {
            sum = Math.max(a[i], sum + a[i]);
            max = Math.max(max, sum);
        }

        System.out.println(max);
    }
}
