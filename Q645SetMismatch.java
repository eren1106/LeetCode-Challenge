class Solution {
    public int[] findErrorNums(int[] nums) {
        int[] res = new int[2];
        
        for(int n : nums){
            if(nums[Math.abs(n) - 1] < 0){ //if the element is negative, means it was reached before
                res[0] = Math.abs(n);
            }
            else{
                nums[Math.abs(n) - 1] *= -1; //convert the first-time-reach element to negative
            }
        }
        
        for(int i = 0; i<nums.length; i++){  
            if(nums[i] > 0){ // if the element positive, means it never reach before, so its index is the missing element
                res[1] = i+1;
                break;
            }
        }
        
        return res;
    }
}