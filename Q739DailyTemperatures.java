class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        Stack<Integer> temps = new Stack<>(); //used to store temperatures
        Stack<Integer> index = new Stack<>(); //used to store the index of temperatures
        
        for(int i = 0; i<temperatures.length; i++){
            if(temps.isEmpty()){
                temps.push(temperatures[i]);
                index.push(i);
                continue;
            }
            while(!temps.isEmpty() && temperatures[i] > temps.peek()){
                temps.pop();
                int tempIndex = index.pop();
                temperatures[tempIndex] = i - tempIndex;
            }
            temps.push(temperatures[i]);
            index.push(i);
        }
        
        while(!temps.isEmpty()){
            temps.pop();
            int tempIndex = index.pop();
            temperatures[tempIndex] = 0; 
        }
        
        return temperatures;
    }
}