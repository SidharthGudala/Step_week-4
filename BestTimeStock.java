class BestTimeStock {
    public static void main(String[] args) {
        int[] prices = {7, 1, 5, 3, 6, 4};
        int min = prices[0], profit = 0;

        for (int p : prices) {
            min = Math.min(min, p);
            profit = Math.max(profit, p - min);
        }

        System.out.println(profit);
    }
}
