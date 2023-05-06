class Solution {
    public int numSubseq(int[] nums, int target) {
        Arrays.sort(nums);
        int res = 0, n = nums.length, l = 0, r = n-1, mod = 1000000007;
        int[] pows = new int[n]; // this arr will contains 2^0 to 2^n

        pows[0] = 1;
        for (int i = 1 ; i < n ; i++) // insert values into pow arr
            pows[i] = pows[i - 1] * 2 % mod;
        
        while(l <= r) {
            if(nums[l] + nums[r] > target) r--;
            else res = (res + pows[r - l++]) % mod;
        }

        return res;
    }
}