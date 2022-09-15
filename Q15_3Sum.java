class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        Arrays.sort(nums);
        if(nums.length < 3 || nums[0] > 0 || nums[nums.length-1] < 0) return res; //the answer must have at least one negative or one positive
        
        for(int i = 0; i<nums.length; i++){
            if(nums[i] > 0) break; //there is no posible answer if the first element is positive
            if(i > 0 && nums[i-1] == nums[i]) continue; //skip repeat value
            int target = 0 - nums[i]; //target is the positive number of the first element, sum of 2nd and 3rd element must same with target to get zero in the end
            int L = i+1;
            int R = nums.length - 1;
            
            while(L < R){
                if(nums[L] + nums[R] == target){
                    res.add(new ArrayList<Integer>(Arrays.asList(nums[i], nums[L], nums[R])));
                    while(L < R && nums[L] == nums[L+1]) L++; //skip repeated value of 2nd element
                    while(L < R && nums[R] == nums[R-1]) R--; //skip repeated value of 3rd element
                    L++;
                    R--;
                }
                else if(nums[L] + nums[R] > target){
                    R--;
                }
                else{
                    L++;
                }
            }
        }
        return res;
    }
}