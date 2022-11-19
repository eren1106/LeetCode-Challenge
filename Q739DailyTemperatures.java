class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        Stack<Integer> index = new Stack<>(); //used to store the index of temperatures
        
        for(int i = 0; i<temperatures.length; i++){
            while(!index.isEmpty() && temperatures[i] > temperatures[index.peek()]){
                int tempIndex = index.pop();
                temperatures[tempIndex] = i - tempIndex;
            }
            index.push(i);
        }
        
        while(!index.isEmpty()){
            int tempIndex = index.pop();
            temperatures[tempIndex] = 0; 
        }
        
        return temperatures;
    }
}