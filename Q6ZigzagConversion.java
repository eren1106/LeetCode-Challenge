class Solution {
    public String convert(String s, int numRows) {
        if(numRows < 2) return s;
        
        String[] rows = new String[numRows];
        for(int i = 0; i<rows.length; i++){
            rows[i] = "";//all row's initial value is null, need to assign empty string first
        }
        int pointer = 0; //point to which row
        boolean down = true;
        for(int i = 0; i<s.length(); i++){
            rows[pointer] += s.charAt(i);
            if(pointer == numRows - 1) down = false;
            if(pointer == 0) down = true;
            pointer += down? 1 : -1;
        }
        String res = "";
        for(String row : rows){
            res += row;
        }
        return res;
    }
}