class Solution {
    public int trap(int[] height) {
        int leftMax = height[0];
        int rightMax = height[height.length - 1];
        int waterCount = 0;
        int i =0,
            j = height.length - 1;

        while(i < j){
            leftMax = Math.max(leftMax,height[i]);
            rightMax = Math.max(rightMax,height[j]);
            if(leftMax < rightMax){
                int sum = leftMax - height[i];
                waterCount += sum;
                i++;
            }else{
                int sum = rightMax - height[j];
                waterCount += sum;
                j--;
            }
        }
        return waterCount;
    }
}
