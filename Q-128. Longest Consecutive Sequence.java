class Solution {
  public int longestConsecutive(int[] nums) {
      if(nums.length < 2) return nums.length;

      Set<Integer> set = new HashSet();
      int res = 0;

      for(int n : nums) {
          set.add(n);
      }
      for(int n : nums){
          if(!set.contains(n-1)) {
              int len = 1;
              while(set.contains(n+len)) {
                  len++;
              }
              res = Math.max(res, len);
          }
      }

      return res;
  }
}