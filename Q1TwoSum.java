class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i < nums.length; i++) {
            int afterMinus = target - nums[i];
            if(map.containsKey(afterMinus)) return new int[]{map.get(afterMinus), i};
            map.put(nums[i], i);
        }

        return new int[]{-1, -1}; // no solutions
    }
}