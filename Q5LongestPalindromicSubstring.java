class Solution {
    public String longestPalindrome(String s) {
        String res = "";
        int len = s.length();
        
        for(int i = 0; i<len; i++){
            int left = i, right = i; //check for odd palindrome
            while(s.charAt(left) == s.charAt(right)){
                left--;
                right++;
                if(left < 0 || right >= len) break;
            }
            if(right - left - 1 > res.length()) res = s.substring(left+1, right);
            
            left = i-1; //check for even palindrome
            right = i;
            while(left >= 0 && s.charAt(left) == s.charAt(right)){
                left--;
                right++;
                if(left < 0 || right >= len) break;
            }
            if(right - left - 1 > res.length()) res = s.substring(left+1, right);
        }
        return res;
    }
}