class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>(); //store num and its frequency
        
        for(int n : nums){
            map.put(n, map.getOrDefault(n, 0) + 1);
        }
        
        List<Integer>[] bucket = new List[nums.length+1]; // create an array of List<Integer> with initial size of nums.length + 1, the list will store the num with same frequency
        
        for(int n : map.keySet()){
            int freq = map.get(n);
            if(bucket[freq] == null){
                bucket[freq] = new ArrayList<>();
            }
            bucket[freq].add(n);
        }
        
        List<Integer> list = new ArrayList<>();
        
        for(int i = bucket.length - 1; i>=0 && k>0; i--){
            if(bucket[i] != null){
                list.addAll(bucket[i]);
                k -= bucket[i].size();
            }   
        }
        
        int[] res = new int[list.size()];
        for(int i = 0; i<res.length; i++){
            res[i] = list.get(i);
        }
        return res;
    }
}