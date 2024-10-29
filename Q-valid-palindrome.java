class Solution {
  public boolean isPalindrome(String s) {
      s = s.toLowerCase();
      int l = 0;
      int r = s.length() - 1;

      while(l < r) {
          char charL = s.charAt(l);
          char charR = s.charAt(r);
          boolean isL = Character.isLetterOrDigit(charL);
          boolean isR = Character.isLetterOrDigit(charR);

          if(!isL || !isR) {
              if(!isL) l++;
              if(!isR) r--;
          }
          else {
              if(charL != charR) return false;
              l++;
              r--;
          }
      }

      return true;
  }
}