class Solution {
  public boolean canConstruct(String ransomNote, String magazine) {
      Map<Character, Integer> map = new HashMap();

      for(char c : magazine.toCharArray()) {
          int n = map.getOrDefault(c, 0);
          map.put(c, n+1);
      }

      for(char c : ransomNote.toCharArray()) {
          Integer n = map.get(c);
          if(n == null || n < 1) return false;
          map.put(c, n-1);
      }

      return true;
  }
}