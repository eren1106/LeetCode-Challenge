class Solution {
  public boolean wordPattern(String pattern, String s) {
      String[] arr = s.split(" ");

      if(pattern.length() != arr.length) return false;

      Map<Character, String> map = new HashMap();
      char[] charArr = pattern.toCharArray();

      for(int i = 0; i < charArr.length; i++) {
          String word = map.get(charArr[i]);

          if(word == null) {
              if(map.containsValue(arr[i])) return false;
              map.put(charArr[i], arr[i]);
              continue;
          }
          
          if(!word.equals(arr[i])) return false;
      }

      return true;
  }
}