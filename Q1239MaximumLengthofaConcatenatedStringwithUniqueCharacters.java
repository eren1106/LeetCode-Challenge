class Solution {
    int max = 0;
    public int maxLength(List<String> arr) {
        dfs(arr, 0, "");
        return max;
    }
    
    public void dfs(List<String> arr, int index, String str){
        if(!isUnique(str)) return; //skip if gt character repeatation in the str
        max = Math.max(max, str.length());
        if(index > arr.size() - 1) return;
        for(int i = index; i<arr.size(); i++){
            dfs(arr, i+1, str + arr.get(i));
        }
    }
    
    public boolean isUnique(String str){ //to check if the str gt char repeatation
        int[] alpha = new int[26];
        for(char c : str.toCharArray()){
            if(alpha[c - 'a'] > 0) return false;
            alpha[c - 'a']++;
        }
        return true;
    }
}