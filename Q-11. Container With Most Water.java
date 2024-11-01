class Solution {
  public int maxArea(int[] height) {
      int l = 0, r = height.length - 1;
      int max = 0;

      while(l < r) {
          int h = Math.min(height[l], height[r]);
          max = Math.max(max, (r-l) * h);

          if(height[l] > height[r]) r--;
          else l++;
      }

      return max;
  }
}