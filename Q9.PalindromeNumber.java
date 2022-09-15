class Solution {
    public boolean isPalindrome(int x) {
        if(x < 0 || (x % 10 == 0 && x != 0)) return false;
        int revertedNum = 0;
        while(x > revertedNum){
            revertedNum *= 10;
            revertedNum += x % 10;
            x /= 10;
        }
        return revertedNum == x || revertedNum/10 == x; //divide 10 to check odd palindrome case
    }
}