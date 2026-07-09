class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> result = new ArrayList<>();

        for(int i = 0; i < nums.length-2; i++){
            if(i > 0 && nums[i] == nums[i-1]) continue;
            int element = nums[i];
            int left = i + 1;
            int right = nums.length - 1;
            
            while(left < right){
                
                int sum = element + nums[left] + nums[right];

                if(sum == 0){
                    List<Integer> nl = new ArrayList<>();
                    nl.add(element);
                    nl.add(nums[left]);
                    nl.add(nums[right]);

                    result.add(nl);

                    while(left < right && nums[left] == nums[left + 1]) left++;
                    while(left < right && nums[right] == nums[right - 1]) right--;


                    left++;
                    right--;
                }else if(sum < 0){
                    left++;
                }else{
                    right--;
                }
            }
        }
        return result;
    }
}
