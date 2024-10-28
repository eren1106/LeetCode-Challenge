class Solution {
  public int maxProfit(int[] prices) {
      int min = Integer.MAX_VALUE;
      int max = 0;

      for(int i : prices) {
          min = Math.min(i, min);
          max = Math.max(max, i - min);
      }

      return max;
  }
}