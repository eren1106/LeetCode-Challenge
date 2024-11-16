class Solution {
  public String longestCommonPrefix(String[] strs) {
      if(strs.length == 1) return strs[0];

      StringBuilder res = new StringBuilder();
      Arrays.sort(strs);
      String str1 = strs[0];

      for(int i = 0; i < str1.length(); i++) {
          char c = str1.charAt(i);
          for(int j = 1; j < strs.length; j++) {
              if(c != strs[j].charAt(i)) return res.toString();
          }

          res.append(c);
      }

      return res.toString();
  }
}