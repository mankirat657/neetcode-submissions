class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer,Integer> map = new HashMap<>();

        for(int i = 0; i < nums.length; i++){
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }
        int maxFreq = 0;

        for(Map.Entry<Integer,Integer> entry : map.entrySet()){
            maxFreq = Math.max(maxFreq,entry.getValue());
        }

        ArrayList<ArrayList<Integer>> buckets = new ArrayList<>();
        for(int i = 0;  i<=maxFreq; i++){
            buckets.add(new ArrayList<>());
        }
        for(Map.Entry<Integer,Integer> entry: map.entrySet()){
            buckets.get(entry.getValue()).add(entry.getKey());
        }
        ArrayList<Integer> res = new ArrayList<>();
        for(int i = maxFreq; i>=1;--i){
            Collections.sort(buckets.get(i),Collections.reverseOrder());

            for(int num : buckets.get(i)){
                res.add(num);

                if(res.size() == k){
                    int[] intArray = res.stream().mapToInt(Integer::intValue).toArray();
                    return intArray;
                }
            }
        }
        
        int[] intArray = res.stream().mapToInt(Integer::intValue).toArray();
        return intArray;
        
    }
}
