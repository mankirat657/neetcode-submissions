class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] result = new int[nums.length];
        int[] preFixArr = new int[nums.length];
        int[] suffixArr = new int[nums.length];
        preFixArr[0] = 1;
        suffixArr[nums.length-1] = 1;
        for(int i = 1; i < nums.length; i++){
            preFixArr[i] = preFixArr[i-1] * nums[i-1];
        }
        for(int i = nums.length-2; i >=0; i--){
            suffixArr[i] = suffixArr[i + 1] * nums[i+1];
        }
        for(int i = 0; i < nums.length; i++){
            result[i] = preFixArr[i] * suffixArr[i];
        }
        return result;
    }
}