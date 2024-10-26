class Solution {
  public int majorityElement(int[] nums) {
      Map<Integer, Integer> map = new HashMap();
      int half = nums.length/2;

      int count;

      for(int i : nums) {
          count = map.getOrDefault(i, 0);
          if(count + 1 > half) return i;
          map.put(i, count + 1);
      }

      return 0;
  }
}