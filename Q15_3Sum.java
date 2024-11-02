class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);

        List<List<Integer>> res = new ArrayList();

        for(int i = 0; i < nums.length - 2; i++) {
            if(nums[i] > 0) break; //there is no posible answer if the first element is positive
            if(i > 0 && nums[i] == nums[i-1]) continue;
            int l = i+1;
            int r = nums.length - 1;
            List<Integer> list = new ArrayList();

            while(l < r) {
                int sum = nums[i] + nums[l] + nums[r];
                if(sum == 0) {
                    res.add(new ArrayList(Arrays.asList(nums[i], nums[l], nums[r])));
                    l++;
                    while(l < nums.length && nums[l] == nums[l-1]) l++;
                }
                else if (sum > 0) r--;
                else l++;
            }
        }

        return res;
    }
}