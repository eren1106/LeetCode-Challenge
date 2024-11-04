class Solution {
  public boolean isIsomorphic(String s, String t) {
      if(s.length() != t.length()) return false;

      Map<Character, Character> map = new HashMap();

      for(int i = 0; i < s.length(); i++) {
          char charS = s.charAt(i);
          char charT = t.charAt(i);
          Character getS = map.get(charS);

          if(getS == null) {
              if(map.containsValue(charT)) return false;
              map.put(charS, charT);
              continue;
          }

          if(getS != charT) return false;
      }

      return true;
  }
}