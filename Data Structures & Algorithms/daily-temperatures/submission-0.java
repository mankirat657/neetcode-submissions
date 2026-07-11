class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        int[] results = new int[temperatures.length];


        for(int i = 0; i < temperatures.length; i++){
                int temp = temperatures[i];
                int count = 0;
            for(int j = i + 1; j < temperatures.length; j++){
                    if(temperatures[j] > temp){
                        results[i] = count+1;
                        break;
                    }else{
                        count +=1;
                    }
            }
        }

        return results;
    }
}
