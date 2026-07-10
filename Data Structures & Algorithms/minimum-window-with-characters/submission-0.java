class Solution {
    public String minWindow(String s, String t) {
        int[] hash = new int[256];
        int left = 0;
        int right = 0;
        int n = s.length();
        int minLen = Integer.MAX_VALUE;
        int m = t.length();
        int startIndex = -1;
        int count = 0;
        for(int i = 0; i < m; i++){
          hash[t.charAt(i)]++;
        }
        while(right < n){
          if(hash[s.charAt(right)] > 0){
            count +=1;
          }
           hash[s.charAt(right)]--;
          while(count == m){
            if(right - left + 1 < minLen){
              minLen = right - left + 1;
              startIndex = left;
            }
            hash[s.charAt(left)]++;
            if(hash[s.charAt(left)] > 0){
              count -=1;
            }
            left++;
          }
          right +=1;
        }

        return startIndex == -1 ? "" : s.substring(startIndex, startIndex + minLen);
    }


}
