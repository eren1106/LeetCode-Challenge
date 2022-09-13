class Solution {
    public int lengthOfLongestSubstring(String s) {
        Map<Character, Integer> map = new HashMap<>(); //key=element, value=index
        int max = 0;
        int cur = 0;
        int cIndex = 0; //current substring starting index
        for(int i = 0; i<s.length(); i++){
            char c = s.charAt(i);
            if(map.containsKey(c) && map.get(c) >= cIndex){ //ignore tha duplicate that exist before the starting index
                cur = i - map.get(c);
                cIndex = map.get(c) + 1; //move the starting pointer to the next character
                map.put(c, i); 
                continue;
            }
            map.put(c, i);
            cur++;
            max = Math.max(cur, max);
        }
        return max;
    }
}