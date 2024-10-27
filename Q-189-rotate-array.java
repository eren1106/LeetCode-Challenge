class Solution {
  public void rotate(int[] nums, int k) {
      int[] clonedArr = nums.clone();
      int l = nums.length;
      int rot = k % nums.length;
      int pointer = rot;

      for(int i = 0; i < l - rot; i++) {
          nums[pointer++] = clonedArr[i];
      }

      pointer = 0;

      for(int i = l - rot; i < l; i++) {
          nums[pointer++] = clonedArr[i];
      }
  }
}