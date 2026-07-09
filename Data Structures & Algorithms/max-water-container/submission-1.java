class Solution {
    public int maxArea(int[] heights) {
       int maxArea = 0;

       int i = 0,
           j = heights.length - 1;

        while(i < j){
            int distance = j - i;
            int min = Math.min(heights[i],heights[j]);
            int totalCapacity = distance * min;
            maxArea = Math.max(maxArea,totalCapacity);
            if(heights[i] < heights[j]){
                i++;
            }else{
                j--;
            }
        } 
        return maxArea;
    }
}
