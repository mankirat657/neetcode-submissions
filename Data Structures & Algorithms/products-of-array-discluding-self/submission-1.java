class Solution {
    public int[] productExceptSelf(int[] nums) {
        int prod = 1;
        int[] result = new int[nums.length];

        for(int i = 0; i < nums.length; i++){
            for(int j = 0; j < nums.length; j++){
                if(j == i) continue;    
                prod = prod * nums[j];
            }
            result[i] = prod;
            prod = 1;
        }

        return result;
    }
}