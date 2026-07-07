class Solution {
    public boolean isAnagram(String s, String t) {
         if (s.length() != t.length()) return false; 
        int[] arr = new int[26];
        
        for(int s1 : s.toCharArray()){
            arr[s1 - 'a']++;
        }
        for(int s2 : t.toCharArray()){
            arr[s2 - 'a']--;
        }

        for(int i = 0; i < arr.length; i++){
            if(arr[i] != 0) return false;
        }
        return true;
    }
}
