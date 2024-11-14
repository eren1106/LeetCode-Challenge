class Solution {
  public int canCompleteCircuit(int[] gas, int[] cost) {        
      int totalSum = 0, sum = 0, start = 0;

      for(int i = 0; i < gas.length; i++) {
          totalSum += gas[i] - cost[i];
          sum += gas[i] - cost[i];

          if(sum < 0) {
              start = i + 1;
              sum = 0;
          }
      }

      return totalSum < 0 ? -1 : start;
  }
}