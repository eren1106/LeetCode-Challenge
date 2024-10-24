// O(1) solution
class Solution {
  public int removeDuplicates(int[] nums) {
      if(nums.length < 2) return nums.length;

      int k = 2; // pointer

      // no need to touch the first 2 number because they are already safe
      for(int i = 2; i < nums.length; i++){
          if(nums[i] != nums[k-2]) nums[k++] = nums[i];
      }

      return k;
  }
}

// O(n) solution
class Solution {
  public int removeDuplicates(int[] nums) {
      Map<Integer, Integer> map = new HashMap<>();
      int k = 0; // pointer

      for(int i = 0; i < nums.length; i++){
          int currentValue = map.getOrDefault(nums[i], 0);
          if(currentValue < 2) {
              nums[k++] = nums[i];
              map.put(nums[i], currentValue + 1);
          }
      }

      return k;
  }
}