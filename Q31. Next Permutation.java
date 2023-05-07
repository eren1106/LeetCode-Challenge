class Solution {
    public void nextPermutation(int[] nums) {
        int len = nums.length;
        boolean flag = true; // if true, such arrangement is not possible, the array must be rearranged as the lowest possible order

        for(int i = len - 2; i >= 0 && flag; i--) {
            if(nums[i] >= nums[i+1]) continue; // skip if not a break point

            for(int j = len - 1; j > i && flag; j--) {
                if(nums[i] >= nums[j]) continue;

                swap(i, j, nums);
                    
                int l = i+1, r = len - 1; 
                while(l < r) {
                    swap(l, r, nums);
                    l++;
                    r--;
                }

                flag = false;
            }
        }

        if(flag) Arrays.sort(nums); // if flag = true, it is the highest possible order, need to sort the array in lowest possible order (ascending order)
    }

    public void swap(int i, int j, int[] nums) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}