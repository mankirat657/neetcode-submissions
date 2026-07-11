class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        int[] results = new int[temperatures.length];
        int n = temperatures.length;
        Stack<int[]> st = new Stack<>();

        for(int i = 0; i < n; i++){
            while (!st.isEmpty() && st.peek()[0] < temperatures[i]) {
                int[] top = st.pop();
                int getIndex = top[1];
                results[getIndex] = i - getIndex;
            }
            st.push(new int[]{temperatures[i],i});
            
        }
       
        return results;
    }
}
