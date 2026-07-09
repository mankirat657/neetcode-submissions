class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        int len = 1;
        int maxLen = 0;
        for(int i = 0;i < nums.length; i++){
            set.add(nums[i]);
        }

        for(int i = 0; i < nums.length; i++){
            int el = nums[i];

            if(set.contains(el - 1)) continue;
            else{
                while(set.contains(el + 1)){
                    len +=1;
                    el = el + 1;
                }
                maxLen = Math.max(maxLen,len);
                len = 1;
            }
        }
        return maxLen;
    }
}
