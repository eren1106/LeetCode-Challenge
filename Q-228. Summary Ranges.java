class Solution {
  public List<String> summaryRanges(int[] nums) {
      List<String> res = new ArrayList<>();
      if(nums.length < 1) return res;

      int l = 0;
      for(int i = 1; i <= nums.length; i++) {
          if(i == nums.length || nums[i] - nums[i-1] != 1) {
              res.add(l == i - 1 ? String.valueOf(nums[l]) : nums[l] + "->" + nums[i-1]);
              l = i;
          }
      }

      return res;
  }
}