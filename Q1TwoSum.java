class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();

        for(int i = 0; i < nums.length; i++) {
            int afterMinusTarget = target - nums[i];
            if(map.containsKey(afterMinusTarget)) {
                return new int[] {map.get(afterMinusTarget), i};
            }
            map.put(nums[i], i);
        }

        return new int[]{}; // no solution found
    }
}