class Solution {
    public List<Integer> partitionLabels(String s) {
        Map<Character, Integer> map = new HashMap<>();
        for(int i = 0; i<s.length(); i++){
            map.put(s.charAt(i), i); //loop through the character one time and put it and its index in the hashmap, the index of the repeated character will be overridden because we only want the last index of the character
        }
        
        List<Integer> res = new ArrayList<>();
        int max = 0, prev = -1; //prev is -1 because currently prev is before index 0
        
        for(int i = 0; i<s.length(); i++){
            max = Math.max(max, map.get(s.charAt(i)));
            
            if(i == max){ // if i == max, means that we reached the end of the particular part
                res.add(max - prev); //max - prev = number of characters in that part
                prev = max;
            }
        }
        
        return res;
    }
}

// for more details refer: https://leetcode.com/problems/partition-labels/discuss/1868842/JavaC%2B%2B-VISUALLY-EXPLAINEDDDDD!!