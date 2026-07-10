class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        ArrayList<Integer> list = new ArrayList<>();
        int n = nums.length;

        for(int i = 0; i <= n - k; i++){
            int maxN = Integer.MIN_VALUE;
            for(int j = i; j < i + k; j++){
                maxN = Math.max(maxN,nums[j]);
            }
            list.add(maxN);
        }
        int[] result = list.stream().mapToInt(Integer::intValue).toArray();

        return result;
    }
}
