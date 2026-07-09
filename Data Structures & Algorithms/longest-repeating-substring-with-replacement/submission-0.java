class Solution {
    public int characterReplacement(String s, int k) {
        HashMap<Character,Integer> map = new HashMap<>();
        int maxFreq = 0;
        int maxLen = 0;
        int left = 0;

        for(int i = 0; i < s.length(); i++){
            map.put(s.charAt(i),map.getOrDefault(s.charAt(i),0)+1);
            maxFreq = Math.max(maxFreq,map.get(s.charAt(i)));
            while((i - left + 1) - maxFreq > k){
                char charAtleft = s.charAt(left);
                map.put(charAtleft,map.get(charAtleft)-1);
                if (map.get(charAtleft) == 0) {
                map.remove(charAtleft);
             }
                left++;
            }
           

            maxLen = Math.max(maxLen,i-left + 1);
        }
        return maxLen;

    }
}
